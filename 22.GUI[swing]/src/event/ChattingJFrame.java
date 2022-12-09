package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChattingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JButton sendBtn;
	private JTextArea chatTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingJFrame frame = new ChattingJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChattingJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 149, 237));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("랜덤채팅");
		lblNewLabel.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\01.JAVA_FUNDEMENTAL\\image\\penguin\\penguin1.gif"));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 178, 170));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		chatTF = new JTextField();
		panel_1.add(chatTF);
		chatTF.setColumns(30);
		
		sendBtn = new JButton("전송");
		sendBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(sendBtn);
		
		chatTA = new JTextArea();
		chatTA.setEditable(false);
		chatTA.setText("유나: 아싸 금요일\r\n");
		contentPane.add(chatTA, BorderLayout.CENTER);
		
		//이벤트소스에 이벤트 핸들러 객체 등록
		ChatSendButtonActionEventHandler handler=new ChatSendButtonActionEventHandler();
		sendBtn.addActionListener(handler);
		
	}	//----->여기까지 생성자
	
	/**********Inner class*************/
	public class ChatSendButtonActionEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("send button click");
			/*
			 * frame의 TextField와 TextArea에 접근해야 함
			 */
			String chatStr=chatTF.getText();
			chatTF.setText("");
			chatTA.append(chatStr+"\n");
			chatTF.requestFocus();
			
		}

	}
	

}
