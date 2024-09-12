package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import helpers.Helper;
import listeners.RepozitorijumMenuActionListener;

public class MenuRepozitorijum extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem MI_Eksportovanje = null;
	JMenuItem MI_Importovanje= null;
	JMenuItem MI_Registracija = null;
	JMenuItem MI_Prijava = null;
	JMenuItem MI_Odjava = null;
	RepozitorijumMenuActionListener actionListener = null;
	
public MenuRepozitorijum() {
		
		setText("Repozitorijum");
		
		actionListener = new RepozitorijumMenuActionListener();
		
		MI_Importovanje = new JMenuItem("Importovanje");
		MI_Importovanje.setIcon(Helper.getMyIconFromName("import"));
		MI_Importovanje.setActionCommand("importovanje");
		MI_Importovanje.addActionListener(actionListener);
		
		MI_Eksportovanje = new JMenuItem("Eksportovanje");
		MI_Eksportovanje.setIcon(Helper.getMyIconFromName("export"));
		MI_Eksportovanje.setActionCommand("eksportovanje");
		MI_Eksportovanje.addActionListener(actionListener);
		
		
		add(MI_Eksportovanje);
		add(MI_Importovanje);
		
		addSeparator();
		
		MI_Registracija = new JMenuItem("Registracija");
		MI_Registracija.setIcon(Helper.getMyIconFromName("registration"));
		MI_Registracija.setActionCommand("registracija");
		MI_Registracija.addActionListener(actionListener);
		
		MI_Prijava = new JMenuItem("Prijava");
		MI_Prijava.setIcon(Helper.getMyIconFromName("login"));
		MI_Prijava.setActionCommand("prijava");
		MI_Prijava.addActionListener(actionListener);
		
		MI_Odjava = new JMenuItem("Odjava");
		MI_Odjava.setIcon(Helper.getMyIconFromName("log_out"));
		MI_Odjava.setActionCommand("odjava");
		MI_Odjava.addActionListener(actionListener);
		
		add(MI_Registracija);
		add(MI_Prijava);
		add(MI_Odjava);
	}

}
