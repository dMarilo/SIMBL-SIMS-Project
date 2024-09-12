package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Image;

import javax.swing.ImageIcon;

import helpers.Helper;
import listeners.HelpMenuActionListener;

public class MenuHelp extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemAbout= null;
	JMenuItem menuItemOnlineHelp = null;
	JMenuItem menuItemFAQ = null;
	
	public MenuHelp()
	{
		setText("Help");
		
		actionListener = new HelpMenuActionListener();
		
		menuItemAbout = new JMenuItem("All you need to know about SIMBL");
		menuItemAbout.setIcon(new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getImage("images/logo/SIMBL.png").getScaledInstance(16, 16, Image.SCALE_SMOOTH)));
		menuItemAbout.setActionCommand("About");
		menuItemAbout.addActionListener(actionListener);
		
		menuItemOnlineHelp = new JMenuItem("Online Help");
		menuItemOnlineHelp.setIcon(Helper.getIconFromName("help"));
		menuItemOnlineHelp.setActionCommand("online Help");
		menuItemOnlineHelp.addActionListener(actionListener);
		
		menuItemFAQ = new JMenuItem("FAQ");
		menuItemFAQ.setIcon(Helper.getMyIconFromName("faq"));
		menuItemFAQ.setActionCommand("faq");
		menuItemFAQ.addActionListener(actionListener);
		
		add(menuItemOnlineHelp);
		add(menuItemAbout);
		add(menuItemFAQ);
	}

}
