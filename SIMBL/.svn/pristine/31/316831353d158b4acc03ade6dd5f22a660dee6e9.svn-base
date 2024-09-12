package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import helpers.Helper;
import listeners.UredjivanjeMenuActionListener;

public class MenuUredjivanje extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenuItem MI_PonistiPrethodniKorak = null;
	JMenuItem MI_PovratiPonisteniKorak = null;
	JMenuItem MI_Isjecanje = null;
	JMenuItem MI_Kopiranje = null;
	JMenuItem MI_Lijepljenje = null;
	JMenuItem MI_OznaciSve = null;
	JMenuItem MI_UbaciElement = null;
	JMenuItem MI_ObrisiOznaceneElemente = null;
	JMenuItem MI_UrediElement = null;
	UredjivanjeMenuActionListener actionListener = null;
	
	@SuppressWarnings("deprecation")
	public MenuUredjivanje()
	{
		setText("Uređivanje");
		setMnemonic(KeyEvent.VK_E);
		
		actionListener = new UredjivanjeMenuActionListener();
		
		MI_PonistiPrethodniKorak = new JMenuItem("Ponisti prethodni korak");
		MI_PonistiPrethodniKorak.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		MI_PonistiPrethodniKorak.setIcon(Helper.getIconFromName("arrow_undo"));
		MI_PonistiPrethodniKorak.setActionCommand("ponisti prethodni korak");
		MI_PonistiPrethodniKorak.addActionListener(actionListener);
		
		MI_PovratiPonisteniKorak = new JMenuItem("Povrati ponisteni korak");
		MI_PovratiPonisteniKorak.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		MI_PovratiPonisteniKorak.setIcon(Helper.getIconFromName("arrow_redo"));
		MI_PovratiPonisteniKorak.setActionCommand("povrati ponisteni korak");
		MI_PovratiPonisteniKorak.addActionListener(actionListener);
		
		add(MI_PonistiPrethodniKorak);
		add(MI_PovratiPonisteniKorak);
		
		addSeparator();
		
		MI_Isjecanje = new JMenuItem("Isjeci");
		MI_Isjecanje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		MI_Isjecanje.setIcon(Helper.getIconFromName("cut"));
		MI_Isjecanje.setActionCommand("isjecanje");
		MI_Isjecanje.addActionListener(actionListener);
		
		MI_Kopiranje = new JMenuItem("Kopiraj");
		MI_Kopiranje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		MI_Kopiranje.setIcon(Helper.getIconFromName("clipboard_text"));
		MI_Kopiranje.setActionCommand("kopiranje");
		MI_Kopiranje.addActionListener(actionListener);
		
		MI_Lijepljenje = new JMenuItem("Zalijepi");
		MI_Lijepljenje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		MI_Lijepljenje.setIcon(Helper.getIconFromName("clipboard_paste_image"));
		MI_Lijepljenje.setActionCommand("lijepljenje");
		MI_Lijepljenje.addActionListener(actionListener);
		
		MI_OznaciSve = new JMenuItem("Označi sve");
		MI_OznaciSve.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
		MI_OznaciSve.setActionCommand("oznaci sve");
		MI_OznaciSve.addActionListener(actionListener);
		
		add(MI_Isjecanje);
		add(MI_Kopiranje);
		add(MI_Lijepljenje);
		add(MI_OznaciSve);
		
		addSeparator();
		
		MI_UbaciElement = new JMenuItem("Ubaci element");
		MI_UbaciElement.setActionCommand("ubaci element");
		MI_UbaciElement.addActionListener(actionListener);
		
		MI_ObrisiOznaceneElemente = new JMenuItem("Obriši označene elemente     ");
		MI_ObrisiOznaceneElemente.setIcon(Helper.getMyIconFromName("eraser"));
		MI_ObrisiOznaceneElemente.setActionCommand("obrisi oznacene elemente");
		MI_ObrisiOznaceneElemente.addActionListener(actionListener);
		
		MI_UrediElement = new JMenuItem("Uredi element");
		MI_UrediElement.setIcon(Helper.getMyIconFromName("edit"));
		MI_UrediElement.setActionCommand("uredi element");
		MI_UrediElement.addActionListener(actionListener);
		
		add(MI_UbaciElement);
		add(MI_ObrisiOznaceneElemente);
		add(MI_UrediElement);
	}


}
