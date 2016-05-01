package userInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class HomeScreen extends JFrame {

	public JPanel contentPane;
	public static JLabel clock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen frame = new HomeScreen();
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
	public HomeScreen() {
		setTitle("RaceTimer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheWorldIs = new JLabel("Current Time:");
		lblTheWorldIs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTheWorldIs.setBounds(10, 11, 131, 37);
		lblTheWorldIs.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTheWorldIs);
		
		clock = new JLabel("00:00:00");
		clock.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		clock.setHorizontalAlignment(SwingConstants.CENTER);
		clock.setBounds(10, 45, 131, 55);
		contentPane.add(clock);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomeScreenActions.start();
			}
		});
		btnStart.setBounds(275, 21, 89, 23);
		contentPane.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreenActions.stop();
			}
		});
		btnStop.setBounds(275, 77, 89, 23);
		contentPane.add(btnStop);
	}
}
