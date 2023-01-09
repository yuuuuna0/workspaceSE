package com.itwill.shop.ui.정유나;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class ProductListPanel_정유나 extends JPanel {
	/*
	 * Service 객체 선언
	 */
	/*
	 * loginMember 객체 선언
	 */
	
	
	/**
	 * Create the panel.
	 */
	public ProductListPanel_정유나() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 104, 57, 15);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(128, 213, 97, 23);
		add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(73, 148, 115, 23);
		add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(63, 257, 32, 23);
		add(comboBox);

	}
}
