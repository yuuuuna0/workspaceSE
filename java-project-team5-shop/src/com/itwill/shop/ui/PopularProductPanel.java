package com.itwill.shop.ui;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JList;

public class PopularProductPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PopularProductPanel() {
		setLayout(null);
		
		table = new JTable();
		table.setBounds(43, 99, 212, 208);
		add(table);

	}
}
