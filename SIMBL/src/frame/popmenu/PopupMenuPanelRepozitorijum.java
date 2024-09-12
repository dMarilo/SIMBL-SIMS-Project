package frame.popmenu;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import helpers.Helper;
import listeners.RepozitorijumMenuActionListener;


public class PopupMenuPanelRepozitorijum extends JPopupMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenuItem menuItemEksportovanje = null;
	JMenuItem menuItemImportovanje= null;
	JMenuItem menuItemRegistracija = null;
	JMenuItem menuItemPrijava = null;
	JMenuItem menuItemOdjava = null;
	
 RepozitorijumMenuActionListener actionListener = null;
	
	public PopupMenuPanelRepozitorijum() {
		
		actionListener = new RepozitorijumMenuActionListener();
		
		menuItemEksportovanje = new JMenuItem("Eksportovanje");
		menuItemEksportovanje.setIcon(Helper.getMyIconFromName("export"));
		menuItemEksportovanje.setActionCommand("eksportovanje");
		menuItemEksportovanje.addActionListener(actionListener);
		
		menuItemImportovanje = new JMenuItem("Importovanje");
		menuItemImportovanje.setIcon(Helper.getMyIconFromName("import"));
		menuItemImportovanje.setActionCommand("importovanje");
		menuItemImportovanje.addActionListener(actionListener);
		
		add(menuItemEksportovanje);
		add(menuItemImportovanje);
		
		addSeparator();
		
		menuItemRegistracija = new JMenuItem("Registracija");
		menuItemRegistracija.setIcon(Helper.getMyIconFromName("registration"));
		menuItemRegistracija.setActionCommand("registracija");
		menuItemRegistracija.addActionListener(actionListener);
		
		menuItemPrijava = new JMenuItem("<html><b>Prijava</b></html>");
		menuItemPrijava.setIcon(Helper.getMyIconFromName("login"));
		menuItemPrijava.setActionCommand("prijava");
		menuItemPrijava.addActionListener(actionListener);
		
		menuItemOdjava = new JMenuItem("Odjava");
		menuItemOdjava.setIcon(Helper.getMyIconFromName("log_out"));
		menuItemOdjava.setActionCommand("odjava");
		menuItemOdjava.addActionListener(actionListener);
		
		add(menuItemRegistracija);
		add(menuItemPrijava);
		add(menuItemOdjava);
	}
}