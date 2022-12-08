package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class FlowLayoutRFame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutRFame frame = new FlowLayoutRFame();
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
	public FlowLayoutRFame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_2 = new JButton("First");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Second");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Third");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("Fourth");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("Fifth");
		contentPane.add(btnNewButton_3);
	}

}
