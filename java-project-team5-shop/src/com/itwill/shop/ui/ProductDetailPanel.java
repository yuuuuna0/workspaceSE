package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itwill.shop.product.Product;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ProductDetailPanel extends JPanel {
	ShopMainFrame frame;
	private JLabel productImageLabel;
	private JLabel productNameLabel;
	/**
	 * Create the panel.
	 */
	public ProductDetailPanel() {
		setBackground(new Color(0, 153, 255));
		setLayout(null);
		
		JButton btnNewButton = new JButton("상품리스트 화면전환");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.changePanel(ShopMainFrame.PRODUCT_LIST_PANEL,null);
			}
		});
		btnNewButton.setBounds(51, 331, 194, 23);
		add(btnNewButton);
	
		productImageLabel = new JLabel("이미지");
		productImageLabel.setIcon(new ImageIcon(ProductDetailPanel.class.getResource("/images/bigle.png")));
		productImageLabel.setBounds(51, 53, 162, 186);
		add(productImageLabel);
		
		productNameLabel = new JLabel("이름");
		productNameLabel.setBounds(109, 249, 57, 15);
		add(productNameLabel);
		
	}
	public void setFrame(ShopMainFrame frame) {
		this.frame=frame;
		
	}
	public void displayProductDetail(Product product) {
		System.out.println("detail panel:"+product);
		productImageLabel.setIcon(new ImageIcon(ProductDetailPanel.class.getResource("/images/"+product.getP_image())));
		productNameLabel.setText(product.getP_name());
		
		
	}
}
