package com.itwill.shop.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.itwill.shop.product.Product;

public class ProductListPanel extends JPanel {
	ShopMainFrame frame;
	private JPanel productItemListPanel;
	/**
	 * Create the panel.
	 */
	public ProductListPanel() {
		setBackground(new Color(0, 51, 255));
		setLayout(null);
		
		JButton btnNewButton = new JButton("상세보기화면전환");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changePanel(ShopMainFrame.PRODUCT_DETAIL_PANEL,null);
			}
		});
		btnNewButton.setBounds(67, 418, 173, 23);
		add(btnNewButton);
		
		JScrollPane productListScrollPane = new JScrollPane();
		productListScrollPane.setBounds(12, 23, 290, 375);
		add(productListScrollPane);
		
		productItemListPanel = new JPanel();
		FlowLayout fl_productItemListPanel = (FlowLayout) productItemListPanel.getLayout();
		fl_productItemListPanel.setAlignment(FlowLayout.LEFT);
		productItemListPanel.setPreferredSize(new Dimension(260, 1000));
		productListScrollPane.setViewportView(productItemListPanel);
		
		/*************product item start*************/
		JPanel productPanel = new JPanel();
		productPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		productPanel.setLayout(null);
		productPanel.setSize(new Dimension(120, 120));
		productPanel.setPreferredSize(new Dimension(120, 120));
		productPanel.setMinimumSize(new Dimension(150, 150));
		productPanel.setMaximumSize(new Dimension(200, 200));
		productPanel.setBounds(new Rectangle(0, 0, 120, 120));
		productPanel.setBorder(null);
		productPanel.setBackground(Color.WHITE);
		productPanel.setAlignmentY(1.0f);
		productPanel.setAlignmentX(1.0f);
		
		JLabel productImageLabel = new JLabel("비글");
		productImageLabel.setIcon(new ImageIcon(ProductListPanel.class.getResource("/images/50bigle.png")));
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setBounds(0, 10, 108, 99);
		productPanel.add(productImageLabel);
		
		productItemListPanel.add(productPanel);
		/*************product item end*************/
		
	}
	public void setFrame(ShopMainFrame frame) throws Exception{
		this.frame = frame;
		productList();
	}
	
	
	public void productList() throws Exception{
		
		List<Product> productList= 
			frame.productService.productList();
		
		productItemListPanel.removeAll();
		for(Product product:productList) {
			
			JPanel productPanel = new JPanel();
			productPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			productPanel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//System.out.println(product);
					//frame.selectProduct=product;
					frame.changePanel(ShopMainFrame.PRODUCT_DETAIL_PANEL,product);
				}
			});
			productPanel.setLayout(null);
			productPanel.setSize(new Dimension(120, 120));
			productPanel.setPreferredSize(new Dimension(120, 120));
			productPanel.setMinimumSize(new Dimension(150, 150));
			productPanel.setMaximumSize(new Dimension(200, 200));
			productPanel.setBounds(new Rectangle(0, 0, 120, 120));
			productPanel.setBorder(null);
			productPanel.setBackground(Color.WHITE);
			productPanel.setAlignmentY(1.0f);
			productPanel.setAlignmentX(1.0f);
			
			JLabel productImageLabel = new JLabel(product.getP_name());
			productImageLabel.setIcon(new ImageIcon(ProductListPanel.class.getResource("/images/50"+product.getP_image())));
			productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
			productImageLabel.setBounds(0, 10, 108, 99);
			productPanel.add(productImageLabel);
			
			productItemListPanel.add(productPanel);
		}
	}
	
	
	
	
	
	
	
	
}
