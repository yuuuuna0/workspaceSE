package chat.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chat.common.ChatProtocol;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;

public class ChatClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JScrollPane scrollPane;
	private JTextArea displayTA;

	private ClientClientThread client;
	private JScrollPane westScrollPane;
	private JList chatList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClientFrame frame = new ChatClientFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public ChatClientFrame() throws Exception {
		setTitle("\uCC44\uD305\uD074\uB77C\uC774\uC5B8\uD2B8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.SOUTH);

		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************/
				String chatStr = chatTF.getText();
				if (chatStr == null || chatStr.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "데이터를 입력하세요");

					chatTF.setText("");
					chatTF.requestFocus();
					return;
				}

				client.send(client.getUserId() + chatStr);
				chatTF.setText("");
				chatTF.requestFocus();
				/***********************/
			}
		});
		chatTF.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chatTF);
		chatTF.setColumns(38);

		JButton sendB = new JButton("\uC804\uC1A1");
		sendB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************/

				/***********************/
			}
		});
		panel.add(sendB);

		westScrollPane = new JScrollPane();
		contentPane.add(westScrollPane, BorderLayout.WEST);

		chatList = new JList();
		chatList.setModel(new AbstractListModel() {
			String[] values = new String[] { "정유가", "정유나", "정유다" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		westScrollPane.setViewportView(chatList);
		/********************* ClientClientThread 객체 생성 *************************/
		client = new ClientClientThread();
		client.start();
		setTitle(client.getUserId() + "님 안녕하세요");

	} // 생성자

	private void displayMessage(String msg) {
		displayTA.append(msg + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/*****************************************************
	 * 클라이언트쪽 소켓을 사용하여 서버와 통신을 담당하는 클래스(VO) - 서버와 연결된 소켓1개를 가지고있는 클래스 - 클라이언트의 정보를
	 * 가지고있는 클래스 - 클라이언트당 1개의 객체가생성
	 ****************************************************/
	public class ClientClientThread extends Thread {
		private Socket socket;
		private String id;
		private BufferedReader in;
		private PrintWriter out;

		public ClientClientThread() throws Exception {
			this.socket = new Socket("192.168.15.31", 8888);
			this.id = socket.getLocalAddress().getHostAddress() + "[" + socket.getLocalPort() + "]";
			this.in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			this.out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
		}

		public String getUserId() {
			return id;

		}

		// 서버로 데이터 전송
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}

		// 서버에서 보내는 데이터를 읽기
		@Override
		public void run() {
			try {
				while (true) {
					System.out.println("A.ClientClientThread: 서버로부터 오는 데이터를 읽기 위해 스레드 무한대기");
					String chatStr = in.readLine();
					String[] chatArray = chatStr.split("#");
					System.out.println(chatStr);
					/*
					 * PAIN_MSG#안녕하세요
					 * LIST_MSG#id1%id2%id3
					 */
					if (chatArray[0].equals(ChatProtocol.PLAIN_MSG)) {
						System.out.println("B.ClientClientThread: 서버로부터 읽은 데이터를 클라이언트 채팅창에 보여준다.");
						displayMessage(chatArray[1]);
					} else if (chatArray[0].equals(ChatProtocol.LIST_MSG)) {
						System.out.println("B.ClientClientThread:서버로부터 읽은 LIST_MSG 데이타로 클라이언트 LIST갱신.");
						String[] idArray = chatArray[1].split("%");
						DefaultListModel model = new DefaultListModel();
						for (String id : idArray) {
							model.addElement(id);
						}
						chatList.setModel(model);
					}
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}

	}
}
