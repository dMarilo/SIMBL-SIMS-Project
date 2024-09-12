package frame.menubar.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import helpers.Helper;
import listeners.ProjekatMenuActionListener;

public class MenuProjekat extends JMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenu noviMenu = null;
	JMenu otvoriMenu = null;
	
	JMenuItem MI_noviProjekat = null;
	JMenuItem MI_noviDijagram = null;
	JMenuItem MI_otvoriProjekat = null;
	JMenuItem MI_otvoriDijagram = null;
	JMenuItem MI_sacuvaj = null;
	JMenuItem MI_sacuvajKao = null;
	JMenuItem MI_stampanje = null;
	JMenuItem MI_Obrisi = null;
	JMenuItem MI_Zatvori = null;
	JMenuItem MI_Preimenuj = null;
	JMenuItem MI_Izlaz = null;
	
	public MenuProjekat()
	{
		
		//TODO listeners!!!
		setText("Projekat");
		setMnemonic(KeyEvent.VK_F);
		
		actionListener = new ProjekatMenuActionListener();

		noviMenu = new JMenu("novi");
		noviMenu.setMnemonic(KeyEvent.VK_N);
		
		MI_noviProjekat = new JMenuItem("Projekat");
		MI_noviProjekat.setIcon(Helper.getMyIconFromName("create_project"));
		MI_noviProjekat.setActionCommand("novi projekat");
		MI_noviProjekat.addActionListener(actionListener);
		
		MI_noviDijagram = new JMenuItem("Dijagram");
		MI_noviDijagram.setIcon(Helper.getMyIconFromName("create_diagram"));
		MI_noviDijagram.setActionCommand("novi dijagram");
		MI_noviDijagram.addActionListener(actionListener);
		
		noviMenu.add(MI_noviProjekat);
		noviMenu.add(MI_noviDijagram);
		add(noviMenu);
		
		otvoriMenu = new JMenu("Otvori iz pretraživača datoteka");
		otvoriMenu.setMnemonic(KeyEvent.VK_O);
		
		MI_otvoriProjekat = new JMenuItem("Projekat");
		MI_otvoriProjekat.setIcon(Helper.getMyIconFromName("create_project"));
		MI_otvoriProjekat.setActionCommand("otvori projekat");
		MI_otvoriProjekat.addActionListener(actionListener);
		
		MI_otvoriDijagram = new JMenuItem("Dijagram");
		MI_otvoriDijagram.setIcon(Helper.getMyIconFromName("create_diagram"));
		MI_otvoriDijagram.setActionCommand("otvori dijagram");
		MI_otvoriDijagram.addActionListener(actionListener);
		
		otvoriMenu.add(MI_otvoriProjekat);
		otvoriMenu.add(MI_otvoriDijagram);
		add(otvoriMenu);
		
		addSeparator();
		
		MI_sacuvaj = new JMenuItem("Sacuvaj");
		MI_sacuvaj.setMnemonic(KeyEvent.VK_S);
		MI_sacuvaj.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		MI_sacuvaj.setIcon(Helper.getMyIconFromName("save"));
		MI_sacuvaj.setActionCommand("sacuvaj");
		MI_sacuvaj.addActionListener(actionListener);
		
		MI_sacuvajKao = new JMenuItem("Sacuvaj kao");
		MI_sacuvajKao.setActionCommand("sacuvaj kao");
		MI_sacuvajKao.setIcon(Helper.getMyIconFromName("save_as"));
		MI_sacuvajKao.addActionListener(actionListener);
		
		add(MI_sacuvaj);
		add(MI_sacuvajKao);
		
		addSeparator();
		
		MI_stampanje = new JMenuItem("Stampanje");
		MI_stampanje.setMnemonic(KeyEvent.VK_P);
		MI_stampanje.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
		MI_stampanje.setIcon(Helper.getIconFromName("printer"));
		MI_stampanje.setActionCommand("stampanje");
		MI_stampanje.addActionListener(actionListener);
		
		add(MI_stampanje);
		
		addSeparator();
		
		MI_Preimenuj = new JMenuItem("Preimenuj");
		MI_Preimenuj.setActionCommand("preimenovanje");
		MI_Preimenuj.addActionListener(actionListener);
		
		MI_Obrisi = new JMenuItem("Obriši");
		MI_Obrisi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		MI_Obrisi.setIcon(Helper.getMyIconFromName("delete"));
		MI_Obrisi.setActionCommand("obrisi");
		MI_Obrisi.addActionListener(actionListener);
		
		add(MI_Preimenuj);
		add(MI_Obrisi);
		
		addSeparator();
		
		MI_Zatvori = new JMenuItem("Zatvori");
		MI_Zatvori.setActionCommand("zatvori");
		MI_Zatvori.addActionListener(actionListener);
		
		add(MI_Zatvori);   
		
		addSeparator();

		
		MI_Izlaz = new JMenuItem("Izlaz");
		MI_Izlaz.setIcon(Helper.getMyIconFromName("exit"));
		MI_Izlaz.setActionCommand("izlaz");
		MI_Izlaz.addActionListener(actionListener);
		
		add(MI_Izlaz);
	}

}
