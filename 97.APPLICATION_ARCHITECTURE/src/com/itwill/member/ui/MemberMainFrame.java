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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;

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
	private JButton joinBtn;
	private JMenu memberMenu;
	private JButton loginBtn;
	private JPanel memberMainPanel;
	private JLabel lblNewLabel_8;
	private JTextField infoIdTF;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JTextField infoNameTF;
	private JLabel lblNewLabel_13;
	private JComboBox infoAgeCB;
	private JCheckBox infoMarriedCK;
	private JLabel idMsgLB_1;
	private JLabel lblNewLabel_14;
	private JMenuItem loginMenuItem;
	private JMenuItem joinMenuItem;
	private JMenuItem logoutMenuItem;
	private JMenuItem exitMenuItem;
	private JButton updateFormBtn;
	private JButton updateBtn;
	private JTextField infoAddressTF;
	private JPasswordField infoPasswordTF;
	private JTable table;
	private JTable table_1;
	private JPanel memberAdminPanel;

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
		
		loginMenuItem = new JMenuItem("로그인");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		memberMenu.add(loginMenuItem);
		
		joinMenuItem = new JMenuItem("가입");
		joinMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(2);
			}
		});
		memberMenu.add(joinMenuItem);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(0);
			}
		});
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		exitMenuItem = new JMenuItem("종료");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		memberMenu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		memberMainPanel = new JPanel();
		memberTabbedPane.addTab("회원메인", null, memberMainPanel, null);
		memberMainPanel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginMember==null) {
					memberTabbedPane.setSelectedIndex(1);
				} else {
					memberTabbedPane.setSelectedIndex(3);
				}
			}
		});
		lblNewLabel_14.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\01.JAVA_FUNDEMENTAL\\image\\ball.png"));
		memberMainPanel.add(lblNewLabel_14, BorderLayout.CENTER);
		
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
						loginIdTF.setText("");
						loginPasswordTF.setText("");
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
		memberInfoPanel.setBackground(new Color(245, 245, 245));
		memberTabbedPane.addTab("회원정보", null, memberInfoPanel, null);
		memberInfoPanel.setLayout(null);
		
		lblNewLabel_8 = new JLabel("아이디");
		lblNewLabel_8.setBounds(76, 66, 57, 15);
		memberInfoPanel.add(lblNewLabel_8);
		
		infoIdTF = new JTextField();
		infoIdTF.setEnabled(false);
		infoIdTF.setEditable(false);
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(217, 63, 116, 21);
		memberInfoPanel.add(infoIdTF);
		
		lblNewLabel_9 = new JLabel("패스워드");
		lblNewLabel_9.setBounds(76, 117, 57, 15);
		memberInfoPanel.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("이름");
		lblNewLabel_10.setBounds(76, 159, 57, 15);
		memberInfoPanel.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("주소");
		lblNewLabel_11.setBounds(76, 201, 57, 15);
		memberInfoPanel.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("나이");
		lblNewLabel_12.setBounds(76, 248, 57, 15);
		memberInfoPanel.add(lblNewLabel_12);
		
		infoNameTF = new JTextField();
		infoNameTF.setEditable(false);
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(217, 156, 116, 21);
		memberInfoPanel.add(infoNameTF);
		
		lblNewLabel_13 = new JLabel("결혼여부");
		lblNewLabel_13.setBounds(76, 293, 57, 15);
		memberInfoPanel.add(lblNewLabel_13);
		
		infoAgeCB = new JComboBox();
		infoAgeCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"}));
		infoAgeCB.setBounds(217, 244, 116, 23);
		memberInfoPanel.add(infoAgeCB);
		
		infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setEnabled(false);
		infoMarriedCK.setBounds(217, 293, 21, 23);
		memberInfoPanel.add(infoMarriedCK);
		
		idMsgLB_1 = new JLabel("");
		idMsgLB_1.setForeground(Color.RED);
		idMsgLB_1.setBounds(200, 326, 116, 15);
		memberInfoPanel.add(idMsgLB_1);
		
		updateFormBtn = new JButton("수정폼");
		updateFormBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnText=updateFormBtn.getText();
				if(btnText.equals("수정폼")) {
					updateFormEnable(true);
				} else if(btnText.equals("수정취소")) {
					displayMemberInfo(loginMember);
					updateFormEnable(false);
				}
				
			}
		});
		updateFormBtn.setBounds(76, 376, 97, 23);
		memberInfoPanel.add(updateFormBtn);
		
		updateBtn = new JButton("수정");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/******** 회원수정 ***********/
				try {
				String id=infoIdTF.getText();
				String password=new String(infoPasswordTF.getPassword());
				String name=infoNameTF.getText();
				String address=infoAddressTF.getText();
				String ageStr=(String)infoAgeCB.getSelectedItem();
				int age=Integer.parseInt(ageStr);
				String married="";
				if(infoMarriedCK.isSelected()) {
					married="T";
				}else {
					married="F";
				}
			Member member=new Member(id,password,name,address,age,married,null);
			memberService.editMember(member);
			loginMember=memberService.memberDetail(id);
			updateFormEnable(false);
			} catch(Exception e1) {
				System.out.println(e1.getMessage());
				}
			}
		});
		updateBtn.setBounds(233, 376, 97, 23);
		memberInfoPanel.add(updateBtn);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setEditable(false);
		infoAddressTF.setBounds(217, 198, 116, 21);
		memberInfoPanel.add(infoAddressTF);
		infoAddressTF.setColumns(10);
		
		infoPasswordTF = new JPasswordField();
		infoPasswordTF.setEditable(false);
		infoPasswordTF.setBounds(217, 114, 116, 21);
		memberInfoPanel.add(infoPasswordTF);
		
		memberAdminPanel = new JPanel();
		memberTabbedPane.addTab("회원관리", null, memberAdminPanel, null);
		memberAdminPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 42, 373, 144);
		memberAdminPanel.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uD328\uC2A4\uC6CC\uB4DC", "\uB984", "\uC8FC\uC18C", "\uB098\uC774", "\uACB0\uD63C", "\uB4F1\uB85D\uC77C"
			}
		));
		scrollPane.setViewportView(table_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"정유가", "정유나", "정유다", "정유라", "정유마", "가가가", "나나나", "다다다", "라라라", "마마마", "바바바", "사사사"}));
		comboBox.setBounds(194, 211, 202, 23);
		memberAdminPanel.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(23, 211, 130, 188);
		memberAdminPanel.add(scrollPane_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"정유가", "정유나", "정유다", "정유라", "정유마", "가가가", "나나나", "다다다", "라라라", "마마마", "바바바", "사사사"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list);
		/************************* 2. MemberService 멤버필드 선언 ****************************/
		memberService=new MemberService();
		logoutProcess();
		/*******************************************************************************/
	}//생성자 끝
	/*
	 * 회원수정 폼 활성화 & 비활성화
	 */
	private void updateFormEnable(boolean b) {
		if(b) {
			//활성화
			infoIdTF.setEnabled(true);
			infoPasswordTF.setEditable(true);
			infoNameTF.setEditable(true);
			infoAddressTF.setEditable(true);
			infoAgeCB.setEditable(true);
			infoMarriedCK.setEnabled(true);
			
			updateFormBtn.setText("수정취소");
			updateBtn.setEnabled(true);
		} else{
			//비활성화
			infoIdTF.setEnabled(false);
			infoPasswordTF.setEditable(false);
			infoNameTF.setEditable(false);
			infoAddressTF.setEditable(false);
			infoAgeCB.setEditable(false);
			infoMarriedCK.setEnabled(false);
			updateFormBtn.setText("수정폼");
			updateBtn.setEnabled(false);
		}
	}
	
	/*
	 * 로그아웃 시 호출 할 메쏘드
	 */
	private void logoutProcess() {
	/************* 로그아웃 시 해야할 일!! ****************
	 * 	1. 로그인 성공 한 멤버 객체 멤버필드에서 제거
	 * 	2. MemberMainFrame 타이틀 변경
	 * 	3. 로그인, 회원가입 탭 활성, 회원정보 탭 비활성 + 로그아웃 메뉴 비활성, 로그인,회원가입 메뉴 활성
	 * 	4. 메인화면전환
	 *********************************************************/
		//1. 로그인 성공 한 멤버 객체 멤버필드에서 제거
		this.loginMember=null;
		//2. MemberMainFrame 타이틀 변경
		setTitle("회원관리");
		//3. 로그인, 회원가입 탭 활성, 회원정보 탭 비활성 + 로그아웃 메뉴 비활성, 로그인,회원가입 메뉴 활성
		memberTabbedPane.setEnabledAt(1,true);
		memberTabbedPane.setEnabledAt(2,true);
		memberTabbedPane.setEnabledAt(3,false);
		loginMenuItem.setEnabled(true);
		joinMenuItem.setEnabled(true);
		logoutMenuItem.setEnabled(false);
		//4. 회원메인 화면전환
		memberTabbedPane.setSelectedIndex(0);
	}
	
	
	/*
	 * 로그인 시 호출 할 메쏘드
	 */
	private void loginProcess(String id) throws Exception{
		/************* 로그인 성공 시 해야할 일!! ****************
		 * 	1. 로그인 성공 한 멤버 객체 멤버필드에 저장
		 * 	2. MemberMainFrame 타이틀 변경
		 * 	3. 로그인, 회원가입 탭 비활성, 회원정보 탭 활성 + 로그아웃 메뉴 활성, 로그인,회원가입 메뉴 비활성
		 * 	4. 회원 정보보기 화면전환
		 *********************************************************/
		//1. 로그인 성공 한 멤버 객체 멤버필드에 저장
		this.loginMember=memberService.memberDetail(id);
		//2. MemberMainFrame 타이틀 변경
		setTitle(id+"님 로그인");
		//3. 로그인,회원가입 탭 비활성화, 회원정보 탭 활성 + 로그아웃 메뉴 활성, 로그인,회원가입 메뉴 비활성
		memberTabbedPane.setEnabledAt(1, false);
		memberTabbedPane.setEnabledAt(2, false);
		memberTabbedPane.setEnabledAt(3, true);
		loginMenuItem.setEnabled(false);
		joinMenuItem.setEnabled(false);
		logoutMenuItem.setEnabled(true);
		//4. 회원 정보보기 화면전환
		memberTabbedPane.setSelectedIndex(3);
		displayMemberInfo(loginMember);
		updateFormEnable(false);
	}
	
	private void displayMemberInfo(Member member) {
		/**** 회원 상세데이터 보여주기 ****/
		infoIdTF.setText(loginMember.getM_id());
		infoPasswordTF.setText(loginMember.getM_password());
		infoNameTF.setText(loginMember.getM_name());
		infoAddressTF.setText(loginMember.getM_address());
		infoAgeCB.setSelectedItem(loginMember.getM_age()+"");
		if(loginMember.getM_married().equals("T")) {
			infoMarriedCK.setSelected(true);
		} else {
			infoMarriedCK.setSelected(false);
		}
	}
}
