package frame.menubar;

import javax.swing.JMenuBar;

import frame.menubar.menu.MenuHelp;
import frame.menubar.menu.MenuProjekat;
import frame.menubar.menu.MenuRepozitorijum;
import frame.menubar.menu.MenuSimulacija;
import frame.menubar.menu.MenuUredjivanje;

public class CustomMenuBar extends JMenuBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomMenuBar()
	{
		add(new MenuProjekat());
		add(new MenuUredjivanje());
		add(new MenuRepozitorijum());
		add(new MenuSimulacija());
		add(new MenuHelp());
	}

}
