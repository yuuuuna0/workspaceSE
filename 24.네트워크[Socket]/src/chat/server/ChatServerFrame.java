package chat.server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField noticeTF;
	private JTextArea displayTA;
	/*********************접속된 클라이언트 객체를 보관할 서비스 객체***********************/
	private ServerClientService clientService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ChatServerFrame frame = new ChatServerFrame();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ChatServerFrame() {
		setTitle("ChatServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		noticeTF = new JTextField();
		noticeTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		panel.add(noticeTF);
		noticeTF.setColumns(45);

		JButton noticeB = new JButton("\uACF5\uC9C0");
		noticeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(noticeB);
		/*********************ServerClientThread 객체 생성*********************/
		clientService=new ServerClientService();
		/*********************ChatServerThread start*********************/
		new ChatServerThread().start();

	}

	private void setLog(String log) {
		displayTA.append(log + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/***********************************************
	 * 특정포트를 열고 클라이언트의 소켓연결요청을 처리해서소켓을생성하는클래스
	 ***********************************************/
	public class ChatServerThread extends Thread {
		@Override
		public void run() {
			try {
				ServerSocket serverSocket=new ServerSocket(8888);
				setLog("0.ChatServerThread:8888번포트에 ServerSocket생성");	
				while(true) {
					setLog("1.ChatServerThread:클라이어트소켓연결요청대기");
					Socket socket=serverSocket.accept();
					setLog("2.ChatServerThread:접속클라이언트"+socket);
					ServerClientThread client=new ServerClientThread(socket);
					client.start();
					clientService.addClient(client);
					setLog("3.ChatServerThread: ClientService 객체에 ServerClientThread객체 추가 및 스레드 start");
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/********************************************
	 * 한명의 클라이언트와통신을 담당하는 클래스(VO(value object)) 
	 * - 클라이언트와연결된 소켓1개를 가지고있는클래스 
	 * - 클라이언트의 정보를 가지고있는 클래스
	 * - 클라이언트당 1개의객체가생성
	 ********************************************/
	public class ServerClientThread extends Thread {
		private String id;	//클라이언트 아이디
		private Socket socket;	//서버쪽소켓
		private PrintWriter out;
		private BufferedReader in;
		
		public ServerClientThread(Socket socket) throws Exception {
			this.socket=socket;
			this.id=socket.getInetAddress().getHostAddress()+"["+socket.getPort()+"]";
			this.in=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
			this.out=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
		}
		
		public String getUserId() {
			return id;
		}
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}

		@Override
		public void run() {
			try {
				while(true) {
					System.out.println("가. ServerClientThread: "+id+"로부터 테이터를 읽기 위해 스레드 대기");
					setLog("가. ServerClientThread "+id+"로부터 테이터를 읽기 위해 스레드 대기");
					String readStr=in.readLine();
					System.out.println("나. ServerClientThread: "+id+"로부터 읽은 데이터 ==> "+readStr);
					clientService.sendBroadcasting(readStr);
					System.out.println("다. ServerClientThread: 연결된 모든 클라이언트에 읽은 데이터 전송");
				}
			} catch (Exception e) {
				e.printStackTrace();
				try {
					clientService.removeClient(this);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		}
	}
	/************************************
	 * 서버에연결된 클라이언트객체(Service)를관리할클래스 
	 * - 클라이언트객체 추가 
	 * - 클라이언트객체 찾기 
	 * - 클라이언트객체 삭제 
	 * - 모든 클라이언트객체에 데이타전송
	 ************************************/
	public class ServerClientService {
		/*
		 * 클라이언트객체 보관리스트
		 */
		private List<ServerClientThread> clientList=new ArrayList<ServerClientThread>();
		/*
		 * 클라이언트객체추가
		 */
		public void addClient(ServerClientThread newClient) throws Exception {
			clientList.add(newClient);
			setLog("A.ServerClientService: "+newClient.getUserId()+"님 입장");
			setLog("B.ServerClientService: 현재 접속자 수 "+clientList.size()+"명");
			
		}

		/*
		 * 클라이언트객체삭제
		 */
		public void removeClient(ServerClientThread removeClient) throws Exception {
			clientList.remove(removeClient);
			setLog("A.ServerClientService: "+removeClient.getUserId()+"님 퇴장");
			setLog("B.ServerClientService: 현재 접속자 수 "+clientList.size()+"명");

		}

		/*
		 *모든클라이언트에 메세지전송
		 */
		public void sendBroadcasting(String msg) throws Exception{
			for(ServerClientThread serverClientThread:clientList) {
				serverClientThread.send(msg);
			}
		}
	}
}
