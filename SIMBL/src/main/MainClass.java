package main;

import javax.swing.SwingUtilities;

import frame.MainFrame;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(() -> {
            // Create and show the main frame
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });

	}

}
