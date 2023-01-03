package com.itwill.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import com.itwill.member.test.MemberServiceTestMain;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MemberMainFrame extends JFrame {
	/************************* 1. Service 멤버필드 선언 ****************************/
	private MemberService memberService;
	/*******************************************************************************/
	/***** 로그인 한 회원 ******/
	private Member loginMember=null;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JButton memberCancleBtn;
	private JComboBox ageCB;
	private JButton memberJoinBtn;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JPasswordField passwordTF;
	private JLabel idMsgLB;
	private JCheckBox marriedCK;
	private JPanel memberLoginPanel;
	private JPanel memberJoinPanel;
	private JTabbedPane memberTabbedPane;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPasswordField loginPasswordTF;
	private JTextField loginIdTF;
	private JPanel memberInfoPanel;
	private JPanel memberJoinPanel_1;
	private JLabel lblNewLabel_8;
	private JTextField infoIdTF;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField infoNameTF;
	private JTextField infoAddressTF;
	private JLabel lblNewLabel_13;
	private JComboBox infoAgeCB;
	private JCheckBox infoMarriedCK;
	private JButton memberJoinBtn_1;
	private JButton memberCancleBtn_1;
	private JPasswordField infoPasswordTF;
	private JLabel idMsgLB_1;
	private JButton joinBtn;
	private JMenu memberMenu;
	private JButton loginBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame() throws Exception{
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 570);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		JMenuItem loginMenuItem = new JMenuItem("로그인");
		memberMenu.add(loginMenuItem);
		
		JMenuItem joinMenuItem = new JMenuItem("가입");
		memberMenu.add(joinMenuItem);
		
		JMenuItem logoutMenuItem = new JMenuItem("로그아웃");
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem_3 = new JMenuItem("종료");
		memberMenu.add(exitMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		memberLoginPanel = new JPanel();
		memberLoginPanel.setBackground(new Color(255, 250, 250));
		memberTabbedPane.addTab("회원로그인", null, memberLoginPanel, null);
		memberLoginPanel.setLayout(null);
		
		lblNewLabel_6 = new JLabel("아이디");
		lblNewLabel_6.setBounds(74, 110, 57, 15);
		memberLoginPanel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("패스워드");
		lblNewLabel_7.setBounds(74, 175, 57, 15);
		memberLoginPanel.add(lblNewLabel_7);
		
		loginPasswordTF = new JPasswordField();
		loginPasswordTF.setBounds(218, 172, 116, 21);
		memberLoginPanel.add(loginPasswordTF);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(218, 107, 116, 21);
		memberLoginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************* 회원로그인 ****************/
				try {
					String id=loginIdTF.getText();
					String password=new String(loginPasswordTF.getPassword());
					
					int result=memberService.login(id, password);
					if(result==0) {
						//로그인 성공
						loginProcess(id);
					}else {
						JOptionPane.showMessageDialog(null, "아이디나 비밀번호를 확인하세요.");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(id.length());
						loginIdTF.requestFocus();
					}
					
				} catch(Exception e1) {
					//
				}
			}
		});
		loginBtn.setBounds(92, 284, 97, 23);
		memberLoginPanel.add(loginBtn);
		
		joinBtn = new JButton("회원가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		joinBtn.setBounds(229, 284, 97, 23);
		memberLoginPanel.add(joinBtn);
		
		memberJoinPanel = new JPanel();
		memberJoinPanel.setBackground(new Color(255, 255, 240));
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(73, 70, 57, 15);
		memberJoinPanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(218, 67, 116, 21);
		memberJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(73, 118, 57, 15);
		memberJoinPanel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(73, 166, 57, 15);
		memberJoinPanel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(73, 211, 57, 15);
		memberJoinPanel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(73, 261, 57, 15);
		memberJoinPanel.add(lblNewLabel_4);
		
		nameTF = new JTextField();
		nameTF.setBounds(218, 163, 116, 21);
		memberJoinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(218, 208, 116, 21);
		memberJoinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		lblNewLabel_5 = new JLabel("결혼여부");
		lblNewLabel_5.setBounds(73, 309, 57, 15);
		memberJoinPanel.add(lblNewLabel_5);
		
		ageCB = new JComboBox();
		ageCB.setEditable(true);
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"}));
		ageCB.setBounds(218, 257, 116, 23);
		memberJoinPanel.add(ageCB);
		
		marriedCK = new JCheckBox("");
		marriedCK.setBounds(218, 309, 21, 23);
		memberJoinPanel.add(marriedCK);
		
		memberJoinBtn = new JButton("가입");
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/******** 회원가입 **********/
				try {
					/***** TextField로 부터 데이터 얻기 *****/
					String id=idTF.getText();
					String password=new String(passwordTF.getPassword());
					String name=nameTF.getText();
					String address=addressTF.getText();
					/******* 유효성 체크 *******/
					if(id.equals("")) {
						idMsgLB.setText("아이디를 입력하세요.");
						idTF.requestFocus();
						return;
					}
					String ageStr=(String)ageCB.getSelectedItem();
					int age=Integer.parseInt(ageStr);
					String married="";
					if(marriedCK.isSelected()) {
						married="T";
					}else {
						married="F";
					}
					
					
				Member newMember=new Member(id,password,name,address,age,married,null);
				boolean isAdd=memberService.addMember(newMember);
				if(isAdd) {
					//로그인 화면전환
					memberTabbedPane.setSelectedIndex(1);
				} else {
					JOptionPane.showMessageDialog(null,"이미 사용하는 아이디입니다. 중복되었습니다");
					idTF.requestFocus();
					idTF.setSelectionStart(0);
					idTF.setSelectionEnd(id.length());
				}
				} catch(Exception e1) {
					 System.out.println("회원가입 -->"+e1.getMessage());
				}
			}
		});
		memberJoinBtn.setBounds(97, 371, 97, 23);
		memberJoinPanel.add(memberJoinBtn);
		
		memberCancleBtn = new JButton("취소");
		memberCancleBtn.setBounds(235, 371, 97, 23);
		memberJoinPanel.add(memberCancleBtn);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(218, 115, 116, 21);
		memberJoinPanel.add(passwordTF);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(Color.RED);
		idMsgLB.setBounds(218, 132, 116, 15);
		memberJoinPanel.add(idMsgLB);
		
		memberInfoPanel = new JPanel();
		memberTabbedPane.addTab("회원정보", null, memberInfoPanel, null);
		memberInfoPanel.setLayout(null);
		
		memberJoinPanel_1 = new JPanel();
		memberJoinPanel_1.setLayout(null);
		memberJoinPanel_1.setBackground(new Color(248, 248, 255));
		memberJoinPanel_1.setBounds(0, 0, 419, 492);
		memberInfoPanel.add(memberJoinPanel_1);
		
		lblNewLabel_8 = new JLabel("아이디");
		lblNewLabel_8.setBounds(73, 112, 57, 15);
		memberJoinPanel_1.add(lblNewLabel_8);
		
		infoIdTF = new JTextField();
		infoIdTF.setEditable(false);
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(218, 109, 116, 21);
		memberJoinPanel_1.add(infoIdTF);
		
		lblNewLabel_9 = new JLabel("패스워드");
		lblNewLabel_9.setBounds(73, 160, 57, 15);
		memberJoinPanel_1.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("이름");
		lblNewLabel_10.setBounds(73, 208, 57, 15);
		memberJoinPanel_1.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("주소");
		lblNewLabel_11.setBounds(73, 253, 57, 15);
		memberJoinPanel_1.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("나이");
		lblNewLabel_12.setBounds(73, 303, 57, 15);
		memberJoinPanel_1.add(lblNewLabel_12);
		
		infoNameTF = new JTextField();
		infoNameTF.setEditable(false);
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(218, 205, 116, 21);
		memberJoinPanel_1.add(infoNameTF);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setEditable(false);
		infoAddressTF.setColumns(10);
		infoAddressTF.setBounds(218, 250, 116, 21);
		memberJoinPanel_1.add(infoAddressTF);
		
		lblNewLabel_13 = new JLabel("결혼여부");
		lblNewLabel_13.setBounds(73, 351, 57, 15);
		memberJoinPanel_1.add(lblNewLabel_13);
		
		infoAgeCB = new JComboBox();
		infoAgeCB.setBounds(218, 299, 116, 23);
		memberJoinPanel_1.add(infoAgeCB);
		
		infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setEnabled(false);
		infoMarriedCK.setBounds(218, 351, 21, 23);
		memberJoinPanel_1.add(infoMarriedCK);
		
		memberJoinBtn_1 = new JButton("가입");
		memberJoinBtn_1.setBounds(97, 413, 97, 23);
		memberJoinPanel_1.add(memberJoinBtn_1);
		
		memberCancleBtn_1 = new JButton("취소");
		memberCancleBtn_1.setBounds(235, 413, 97, 23);
		memberJoinPanel_1.add(memberCancleBtn_1);
		
		infoPasswordTF = new JPasswordField();
		infoPasswordTF.setEditable(false);
		infoPasswordTF.setBounds(218, 157, 116, 21);
		memberJoinPanel_1.add(infoPasswordTF);
		
		idMsgLB_1 = new JLabel("");
		idMsgLB_1.setForeground(Color.RED);
		idMsgLB_1.setBounds(218, 132, 116, 15);
		memberJoinPanel_1.add(idMsgLB_1);
		/************************* 2. MemberService 멤버필드 선언 ****************************/
		memberService=new MemberService();
		/*******************************************************************************/
	}//생성자 끝
	
	private void loginProcess(String id) throws Exception{
		/************* 로그인 성공 시 해야할 일!! ****************
		 * 	1. 로그인 성공 한 멤버 객체 멤버필드에 저장
		 * 	2. MemberMainFrame 타이틀 변경
		 * 	3. 로그인, 회원가입 탭 비활성
		 * 	4. 회원 정보보기 화면전환
		 *********************************************************/
		//1. 로그인 성공 한 멤버 객체 멤버필드에 저장
		this.loginMember=memberService.memberDetail(id);
		//2. MemberMainFrame 타이틀 변경
		setTitle(id+"님 로그인");
		//3. 로그인,회원가입 탭 비활성화
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		//4. 회원 정보보기 화면전환
		memberTabbedPane.setSelectedIndex(2);
		
		/**** 회원 상세데이터 보여주기 ****/
		infoIdTF.setText(loginMember.getM_id());
		infoPasswordTF.setText(loginMember.getM_password());
		infoNameTF.setText(loginMember.getM_name());
		infoAddressTF.setText(loginMember.getM_address());
	}
}
