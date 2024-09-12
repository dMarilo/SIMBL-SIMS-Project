package frame.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import helpers.Helper;
import listeners.SimulacijaMenuActionListener;

public class MenuSimulacija extends JMenu{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JMenuItem MI_PokretanjeSimulacije = null;
	JMenuItem MI_ZatvaranjeSimulacije = null;
	JMenuItem MI_ZaustavljanjeSimulacije = null;
	JMenuItem MI_VerifikacijaSimulacije = null;
	
	SimulacijaMenuActionListener actionListener = null;
	
	public MenuSimulacija() {
		
		setText("Simulacija");
		
		actionListener = new SimulacijaMenuActionListener();
		
		MI_PokretanjeSimulacije = new JMenuItem("Pokreni");
		MI_PokretanjeSimulacije.setIcon(Helper.getMyIconFromName("start"));
		MI_PokretanjeSimulacije.setActionCommand("pokretanje simulacije");
		MI_PokretanjeSimulacije.addActionListener(actionListener);
		
		MI_ZatvaranjeSimulacije = new JMenuItem("Zatvori");
		MI_ZatvaranjeSimulacije.setIcon(Helper.getMyIconFromName("stop"));
		MI_ZatvaranjeSimulacije.setActionCommand("zatvaranje simulacije");
		MI_ZatvaranjeSimulacije.addActionListener(actionListener);
		
		MI_ZaustavljanjeSimulacije = new JMenuItem("Zaustavi");
		MI_ZaustavljanjeSimulacije.setIcon(Helper.getMyIconFromName("pause"));
		MI_ZaustavljanjeSimulacije.setActionCommand("zaustavljanje simulacije");
		MI_ZaustavljanjeSimulacije.addActionListener(actionListener);

		add(MI_PokretanjeSimulacije);
		add(MI_ZatvaranjeSimulacije);
		add(MI_ZaustavljanjeSimulacije);
		
		addSeparator();
		
		MI_VerifikacijaSimulacije = new JMenuItem("Verifikuj");
		MI_VerifikacijaSimulacije.setIcon(Helper.getIconFromName("accept"));
		MI_VerifikacijaSimulacije.setActionCommand("verifikacija simulacije");
		MI_VerifikacijaSimulacije.addActionListener(actionListener);
		
		add(MI_VerifikacijaSimulacije);
	}

}
