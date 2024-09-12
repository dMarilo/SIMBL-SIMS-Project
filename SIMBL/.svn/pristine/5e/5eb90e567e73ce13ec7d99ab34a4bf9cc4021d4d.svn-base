package frame;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import frame.desktop.RadnaPovrsina;
import frame.paletaAlatki.PaletaAlatki;
import frame.pretrazivacprojekta.PretrazivacProjekta;

public class MainPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainPanel()
	{
		
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		//Pretrazivac projekata
				JPanel pretrazivacProjekata = new JPanel();
				pretrazivacProjekata.setLayout(new BorderLayout());
				pretrazivacProjekata.add(new PretrazivacProjekta());
				add(pretrazivacProjekata,BorderLayout.WEST);
		
		
		JScrollPane paleta = new JScrollPane(new PaletaAlatki());
		paleta.setPreferredSize(new Dimension(220,0));
		paleta.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		paleta.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		paleta.getVerticalScrollBar().setUnitIncrement(16);
		add(paleta,BorderLayout.EAST);
		
		JPanel centar = new JPanel();
		centar.setLayout(new BorderLayout());
		centar.add(new RadnaPovrsina(), BorderLayout.CENTER);
		add(centar, BorderLayout.CENTER);
		
	}

}
