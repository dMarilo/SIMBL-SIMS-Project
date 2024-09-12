package frame.toolbar.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

import frame.MainFrame;
import helpers.Helper;

public class ToolsForZoom extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton zoomInBtn = null;
	JButton zoomOutBtn = null;
	
	public ToolsForZoom() {
		setFloatable(false);
		
		zoomInBtn = new JButton();
		zoomInBtn.setToolTipText("Uvecaj prikaz dijagrama");
		zoomInBtn.setIcon(Helper.getIconFromName("magnifier_zoom_in"));
		zoomInBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	
		zoomOutBtn = new JButton();
		zoomOutBtn.setToolTipText("Umanji prikaz dijagrama");
		zoomOutBtn.setIcon(Helper.getIconFromName("magnifier"));
		zoomOutBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		add(zoomInBtn);
		add(zoomOutBtn);
	}

}
