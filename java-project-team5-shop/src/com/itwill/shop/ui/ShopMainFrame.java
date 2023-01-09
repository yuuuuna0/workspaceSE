package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
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
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel globalSouthMenuPanel = new JPanel();
		globalSouthMenuPanel.setBackground(new Color(250, 250, 210));
		contentPane.add(globalSouthMenuPanel, BorderLayout.SOUTH);
		globalSouthMenuPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
		
		JButton globalSearchMenuBtn = new JButton("");
		globalSearchMenuBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalSearchMenuBtn.setBorder(null);
		globalSearchMenuBtn.setOpaque(false);
		globalSearchMenuBtn.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		globalSouthMenuPanel.add(globalSearchMenuBtn);
		
		JButton globalHomeMenuBtn = new JButton("");
		globalHomeMenuBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalHomeMenuBtn.setBorder(null);
		globalHomeMenuBtn.setOpaque(false);
		globalHomeMenuBtn.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/shoppingmall.png")));
		globalSouthMenuPanel.add(globalHomeMenuBtn);
		
		JButton globalMemberMenuBtn = new JButton("");
		globalMemberMenuBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalMemberMenuBtn.setBorder(null);
		globalMemberMenuBtn.setOpaque(false);
		globalMemberMenuBtn.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/user.png")));
		globalSouthMenuPanel.add(globalMemberMenuBtn);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		productTabbedPane.addTab("New tab", null, popularProductPanel, null);
		
		JTabbedPane MemberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, MemberTabbedPane, null);
		
		MemberJoinPanel memberJoinPanel = new MemberJoinPanel();
		MemberTabbedPane.addTab("New tab", null, memberJoinPanel, null);
		
	}
}
