package frame.pretrazivacprojekta;

import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.popmenu.PopupMenuPanelRepozitorijum;

public class PanelRepozitorijum extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PopupMenuPanelRepozitorijum popup = null;
	
	public PanelRepozitorijum() {
		
		popup = new PopupMenuPanelRepozitorijum();
		
		add(new JLabel("Problemi sa internet konekcijom."));
		
		setComponentPopupMenu(popup);
	}
}
