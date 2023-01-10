package com.itwill.shop.ui.김경호;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.user.User;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;

public class ProductListPanel_김경호 extends JPanel {
	/*****************************/
	/*
	 * XXX Sevice객체선언
	 */
	ProductService productService;
	/*
	 * loginMember객체선언
	 */
	User loginUser;
	private JPanel productListPanel;
	
	
	/**
	 * Create the panel.
	 */
	public ProductListPanel_김경호() throws Exception{
		setBackground(Color.GREEN);
		setLayout(null);
		
		JScrollPane productListScrollPane = new JScrollPane();
		productListScrollPane.setBounds(12, 85, 296, 304);
		add(productListScrollPane);
		
		productListPanel = new JPanel();
		productListPanel.setPreferredSize(new Dimension(10, 700));
		productListScrollPane.setViewportView(productListPanel);
		/********************제품패널생성***********************/
		JPanel productPanel = new JPanel();
		productPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productPanel.setPreferredSize(new Dimension(270, 80));
		
		productPanel.setLayout(null);
		
		JLabel productImageLabel = new JLabel("비글");
		productImageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		productImageLabel.setIcon(new ImageIcon(ProductListPanel_김경호.class.getResource("/images/50bigle.jpg")));
		productImageLabel.setBounds(7, 7, 72, 73);
		productPanel.add(productImageLabel);
		
		JLabel productTitleLabel = new JLabel("비글");
		productTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productTitleLabel.setFont(new Font("굴림", Font.BOLD, 13));
		productTitleLabel.setBounds(91, 10, 84, 15);
		productPanel.add(productTitleLabel);
		
		JLabel productDescLabel = new JLabel("<html>귀여운강아지여요<br>가격 23000</html>");
		productDescLabel.setBounds(74, 31, 147, 49);
		productPanel.add(productDescLabel);
		
		
		productListPanel.add(productPanel);
		/************************************************/
		
		/*
		 * XXX Sevice객체생성
		 */
		productService=new ProductService();
		/*
		 * loginMember객체생성
		 */
		loginUser=new User("guard1",null,null,null);
		/************************************/
		productList();
	}
	/*************************************/
	private void productList()throws Exception {
		List<Product> productList=productService.productList();
		for(Product product:productList) {
			JPanel productPanel = new JPanel();
			productPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			productPanel.setPreferredSize(new Dimension(270, 80));
			
			productPanel.setLayout(null);
			
			JLabel productImageLabel = new JLabel(product.getP_name());
			productImageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
			productImageLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
			productImageLabel.setIcon(new ImageIcon(ProductListPanel_김경호.class.getResource("/images/50"+product.getP_image())));
			productImageLabel.setBounds(7, 7, 72, 73);
			productPanel.add(productImageLabel);
			
			JLabel productTitleLabel = new JLabel("비글");
			productTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			productTitleLabel.setFont(new Font("굴림", Font.BOLD, 13));
			productTitleLabel.setBounds(91, 10, 84, 15);
			productPanel.add(productTitleLabel);
			
			JLabel productDescLabel = new JLabel("<html>귀여운강아지여요<br>가격 "+product.getP_price()+"</html>");
			productDescLabel.setBounds(74, 31, 147, 49);
			productPanel.add(productDescLabel);
			
			
			productListPanel.add(productPanel);
		}
		
	}
}
