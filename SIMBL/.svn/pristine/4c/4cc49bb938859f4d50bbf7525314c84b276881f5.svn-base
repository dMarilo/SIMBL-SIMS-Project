package frame.paletaAlatki;

import javax.swing.BorderFactory;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.paletaAlatki.palete.Artefakti;
import frame.paletaAlatki.palete.ElementiSpajanja;
import frame.paletaAlatki.palete.ElementiToka;
import frame.paletaAlatki.palete.Particije;
import helpers.Helper;



public class PaletaAlatki extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PaletaAlatki() {

		JLabel lblNaslovElementiToka = null;
		JLabel lblNaslovElementiSpajanja = null;
		JLabel lblNaslovParticije = null;
		JLabel lblNaslovArtefakti = null;
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEtchedBorder());
		
		lblNaslovElementiToka = new JLabel("<html><font size=\"4\"><b>Elementi toka<b></fontsize></html>");
		add(Helper.getHelperPanel(lblNaslovElementiToka));
		
		add(new ElementiToka());
		
		lblNaslovElementiSpajanja = new JLabel("<html><font size=\"4\"><b>Elementi spajanja<b></fontsize></html>");
		add(Helper.getHelperPanel(lblNaslovElementiSpajanja));
		
		add(new ElementiSpajanja());
		
		lblNaslovParticije = new JLabel("<html><font size=\"4\"><b>Particije<b></fontsize></html>");
		add(Helper.getHelperPanel(lblNaslovParticije));
		
		add(new Particije());
		
		lblNaslovArtefakti = new JLabel("<html><font size=\"4\"><b>Artefakti<b></fontsize></html>");
		add(Helper.getHelperPanel(lblNaslovArtefakti));
		
		add(new Artefakti());
		

	}

}
