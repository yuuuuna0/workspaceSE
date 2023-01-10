package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.shop.cart.CartService;
import com.itwill.shop.order.OrderService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Cursor;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {
	/*
	 * Panel상수
	 */
	public static final int  PRODUCT_LIST_PANEL=1;
	public static final int  PRODUCT_DETAIL_PANEL=2;
	public static final int  USERT_JOIN_PANEL=3;
	public static final int  USER_INFO_PANEL=4;
	
	
	/************************************
	 * 1.Service객체선언
	 ************************************/
	UserService userService;
	OrderService orderService;
	CartService cartService;
	ProductService productService;
	
	/**************************************
	 * 2.login User객체선언(선택한Product객체선언)
	 *************************************/
	User loginUser=null;
	Product selectProduct;
	
	
	private JPanel contentPane;
	private JTabbedPane shopTabbedPane;
	private ProductListPanel productListPanel;
	private ProductDetailPanel productDetailPanel;
	private MemberJoinPanel memberJoinPanel;
	private MemberInfoPanel memberInfoPanel;
	private JTabbedPane productTabbedPane;
	private JTabbedPane memberTabbedPane;
	

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
	public ShopMainFrame() throws Exception{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		
		JPanel globalSouthMenuPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMenuPanel.getLayout();
		flowLayout.setHgap(20);
		globalSouthMenuPanel.setBackground(Color.WHITE);
		contentPane.add(globalSouthMenuPanel, BorderLayout.SOUTH);
		
		JButton globalSearchMenuButton = new JButton("");
		globalSearchMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalSearchMenuButton.setBorder(null);
		globalSearchMenuButton.setOpaque(false);
		globalSearchMenuButton.setBackground(new Color(240, 240, 240));
		globalSearchMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/search_dog50.png")));
		globalSouthMenuPanel.add(globalSearchMenuButton);
		
		JButton globalHomeMenuButton = new JButton("");
		globalHomeMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalHomeMenuButton.setOpaque(false);
		globalHomeMenuButton.setBorder(null);
		globalHomeMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/user.png")));
		globalSouthMenuPanel.add(globalHomeMenuButton);
		
		JButton globalMemberMenuButton = new JButton("");
		globalMemberMenuButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalMemberMenuButton.setOpaque(false);
		globalMemberMenuButton.setBorder(null);
		globalMemberMenuButton.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/images/cart50.png")));
		globalSouthMenuPanel.add(globalMemberMenuButton);
		
		shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		productListPanel = new ProductListPanel();
		productTabbedPane.addTab("상품리스트", null, productListPanel, null);
		
		productDetailPanel = new ProductDetailPanel();
		productTabbedPane.addTab("상품상세보기", null, productDetailPanel, null);
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, memberTabbedPane, null);
		
		memberJoinPanel = new MemberJoinPanel();
		memberTabbedPane.addTab(" 가입", null, memberJoinPanel, null);
		
		memberInfoPanel = new MemberInfoPanel();
		memberTabbedPane.addTab("회원상세", null, memberInfoPanel, null);
		
		/************************************
		 * 3.Service객체생성
		 ************************************/
		userService=new UserService();
		orderService=new OrderService();
		productService=new ProductService();
		cartService=new CartService();
		
		/*******ShopMainFrame참조를 Panel에 넘겨줌*******/
		productListPanel.setFrame(this);
		productDetailPanel.setFrame(this);
		memberInfoPanel.setFrame(this);
		memberJoinPanel.setFrame(this);
		
	}//생성
	/***********패널변경메쏘드********/
	public void changePanel(int panel_no,Object data) {
		if(panel_no==PRODUCT_LIST_PANEL) {
			shopTabbedPane.setSelectedIndex(0);
			productTabbedPane.setSelectedIndex(0);
		}else if(panel_no==PRODUCT_DETAIL_PANEL) {
			Product product=(Product)data;
			System.out.println("recv product"+product);
			
			shopTabbedPane.setSelectedIndex(0);
			productTabbedPane.setSelectedIndex(1);
			productDetailPanel.displayProductDetail(product);
			
		}else if(panel_no==USER_INFO_PANEL) {
			shopTabbedPane.setSelectedIndex(1);
			productTabbedPane.setSelectedIndex(1);
		}else if(panel_no==USERT_JOIN_PANEL) {
			shopTabbedPane.setSelectedIndex(1);
			productTabbedPane.setSelectedIndex(0);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
