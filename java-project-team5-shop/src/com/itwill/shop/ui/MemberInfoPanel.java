package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

public class MemberInfoPanel extends JPanel {
	ShopMainFrame frame;
	/**
	 * Create the panel.
	 */
	public MemberInfoPanel() {
		setBackground(new Color(255, 204, 204));
		setForeground(new Color(255, 51, 255));
		setLayout(null);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.setBounds(12, 327, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(140, 327, 97, 23);
		add(btnNewButton_1);

	}
	public void setFrame(ShopMainFrame frame) {
		this.frame = frame;
	}
}
