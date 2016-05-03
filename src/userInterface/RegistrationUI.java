package userInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class RegistrationUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationUI frame = new RegistrationUI();
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
	public RegistrationUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Exit");
		menu.add(menuItem);
		
		JMenu menu_1 = new JMenu("Edit");
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("Race");
		menu_2.setEnabled(false);
		menuBar.add(menu_2);
		
		JMenuItem menuItem_1 = new JMenuItem("Start Timer");
		menu_2.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Stop Timer");
		menu_2.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Edit Racers");
		menu_2.add(menuItem_3);
		
		JMenu menu_3 = new JMenu("Mode");
		menuBar.add(menu_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Timer");
		menu_3.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("Registration");
		menu_3.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("Results");
		menu_3.add(menuItem_6);
	}

}
