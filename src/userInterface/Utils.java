package userInterface;

import javax.swing.JOptionPane;

public class Utils {
	private static String titleBar;
	public static void infoBox(String infoMessage, String title)
    {
		if (title == "" | title == null){
			titleBar = "OpenRun";
		}
		else{
			titleBar = title;
		}
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}
