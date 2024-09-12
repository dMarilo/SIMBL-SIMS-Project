package frame.toolbar.tools;

import javax.swing.JButton;
import javax.swing.JToolBar;

import helpers.Helper;
import listeners.SimulacijaMenuActionListener;

public class ToolsForSimulacija extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton startBtn = null;
	JButton pauseBtn = null;
	JButton stopBtn = null;
	SimulacijaMenuActionListener actionListener = null;
	
	public ToolsForSimulacija() {
		setFloatable(false);
		
		actionListener = new SimulacijaMenuActionListener();
		
		startBtn = new JButton();
		startBtn.setToolTipText("Započni simulaciju");
		startBtn.setIcon(Helper.getMyIconFromName("start"));
		startBtn.setActionCommand("pokretanje simulacije");
		startBtn.addActionListener(actionListener);
		add(startBtn);
		
		pauseBtn = new JButton();
		pauseBtn.setToolTipText("Zatvori simulaciju");
		pauseBtn.setIcon(Helper.getMyIconFromName("stop"));
		pauseBtn.setActionCommand("zatvaranje simulacije");
		pauseBtn.addActionListener(actionListener);
		add(pauseBtn);
		
		stopBtn = new JButton();
		stopBtn.setToolTipText("Zaustavi simulaciju");
		stopBtn.setIcon(Helper.getMyIconFromName("pause"));
		stopBtn.setActionCommand("zaustavljanje simulacije");
		stopBtn.addActionListener(actionListener);
		add(stopBtn);
		
	}

}
