package frame.popmenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import listeners.ProjekatMenuActionListener;


public class PopupMenuPanelProjekat extends JPopupMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem menuItemZatvoriSveProjekte = null;
	
	ProjekatMenuActionListener actionListener = null;

	public PopupMenuPanelProjekat() {
		
		actionListener = new ProjekatMenuActionListener();

		menuItemZatvoriSveProjekte = new JMenuItem("<html><b>Zatvori sve projekte</b></html>");
		menuItemZatvoriSveProjekte.setActionCommand("zatvori sve projekte");
		menuItemZatvoriSveProjekte.addActionListener(actionListener);
		
		add(menuItemZatvoriSveProjekte);
	}

}
