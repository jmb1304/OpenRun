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
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class HomeScreen extends JFrame {

	public JPanel contentPane;
	public static JLabel clock = new JLabel("Hello");
	public static JButton btnStop = new JButton("Stop");
	private JTable table;

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
		setResizable(false);
		setTitle("OpenRace");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 946, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		panel.setBounds(10, 440, 391, 190);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		JLabel lblTheWorldIs = new JLabel("Current Time:");
		lblTheWorldIs.setBounds(10, 71, 155, 35);
		panel.add(lblTheWorldIs);
		lblTheWorldIs.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblTheWorldIs.setHorizontalAlignment(SwingConstants.CENTER);
		
		clock = new JLabel("00:00:00.00");
		clock.setBounds(10, 81, 272, 86);
		panel.add(clock);
		clock.setFont(new Font("Times New Roman", Font.PLAIN, 46));
		clock.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(272, 9, 109, 43);
		panel.add(btnStart);
		
		btnStop = new JButton("Stop");
		btnStop.setBounds(272, 63, 109, 43);
		panel.add(btnStop);
		contentPane.add(panel);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Time", "Bib ID #", "First Name", "Last Name", "Notes"},
			},
			new String[] {
				"Time", "Bib ID #", "First Name", "Last Name", "Notes"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(10, 75, 474, 350);
		contentPane.add(table);
		
		JLabel lblRunners = new JLabel("Runners:");
		lblRunners.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRunners.setBounds(10, 27, 207, 37);
		contentPane.add(lblRunners);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 940, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnNewMenu.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnRace = new JMenu("Race");
		menuBar.add(mnRace);
		
		JMenuItem mntmStartTimer = new JMenuItem("Start Timer");
		mntmStartTimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomeScreenActions.start();
			}
		});
		mnRace.add(mntmStartTimer);
		
		JMenuItem mntmStopTimer = new JMenuItem("Stop Timer");
		mntmStopTimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreenActions.stop();
			}
		});
		mnRace.add(mntmStopTimer);
		
		JMenuItem mntmEditRacers = new JMenuItem("Edit Racers");
		mnRace.add(mntmEditRacers);
		
		JMenu mnMode = new JMenu("Mode");
		menuBar.add(mnMode);
		
		JMenuItem mntmRace = new JMenuItem("Timer");
		mnMode.add(mntmRace);
		
		JMenuItem mntmRegistration = new JMenuItem("Registration");
		mnMode.add(mntmRegistration);
		
		JMenuItem mntmResults = new JMenuItem("Results");
		mnMode.add(mntmResults);
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomeScreenActions.stop();
			}
		});
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HomeScreenActions.start();
			}
		});
	}
}
