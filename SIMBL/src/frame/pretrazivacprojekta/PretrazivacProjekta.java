package frame.pretrazivacprojekta;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import helpers.Helper;

public class PretrazivacProjekta extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public PretrazivacProjekta() {
		
		JScrollPane scrollPane = new JScrollPane(new PanelProjekat());
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        
		addTab("Projekat", Helper.getIconFromName("package"), scrollPane);
		addTab("Repozitorijum", Helper.getIconFromName("drive_network"), new PanelRepozitorijum());
		setPreferredSize(new Dimension(200, 0));
		setTabPlacement(JTabbedPane.BOTTOM);
	}
}
