package frame.toolbar.tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;

import frame.MainFrame;
import helpers.Helper;
import listeners.ProjekatMenuActionListener;

public class ToolsForProjekat extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton newBtn = null;
	JButton newDropdownBtn = null;
	JPopupMenu New = null;
	JMenuItem MI_NoviProjekat = null;
	JMenuItem MI_NoviDijagram = null;
	JButton saveBtn = null;
	JButton saveAsBtn = null;
	ProjekatMenuActionListener actionListener = null;
	
	public ToolsForProjekat() {
		setFloatable(false);
		
		actionListener = new ProjekatMenuActionListener();

		New = new JPopupMenu();
		
		MI_NoviProjekat = new JMenuItem("Projekat");
		MI_NoviProjekat.setIcon(Helper.getMyIconFromName("create_project"));
		MI_NoviProjekat.setActionCommand("novi projekat");
		MI_NoviProjekat.addActionListener(actionListener);
		
		MI_NoviDijagram = new JMenuItem("Dijagram");
		MI_NoviDijagram.setIcon(Helper.getMyIconFromName("create_diagram"));
		MI_NoviDijagram.setActionCommand("novi dijagram");
		MI_NoviDijagram.addActionListener(actionListener);
		
		New.add(MI_NoviProjekat);
		New.add(MI_NoviDijagram);
		
		newBtn = new JButton();
		newBtn.setToolTipText("Kreiranje");
		newBtn.setIcon(Helper.getMyIconFromName("create_project"));
		newBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(MainFrame.contentPane, "Funkcija u implementaciji!!!", "Poruka", JOptionPane.INFORMATION_MESSAGE);				
			}
		});

		
		newDropdownBtn = new JButton();
		newDropdownBtn.setToolTipText("Kreiranje");
		newDropdownBtn.setIcon(Helper.getMyIconFromName("arrow_down_create"));
		newDropdownBtn.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e)
			{
				New.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		add(newBtn);
		add(newDropdownBtn);
		
		saveBtn = new JButton();
		saveBtn.setToolTipText("Sačuvaj");
		saveBtn.setIcon(Helper.getMyIconFromName("save"));
		saveBtn.setActionCommand("sacuvaj");
		saveBtn.addActionListener(actionListener);
		add(saveBtn);
		
		saveAsBtn = new JButton();
		saveAsBtn.setToolTipText("Sačuvaj kao");
		saveAsBtn.setIcon(Helper.getMyIconFromName("save_as"));
		saveAsBtn.setActionCommand("sacuvaj kao");
		saveAsBtn.addActionListener(actionListener);
		add(saveAsBtn);
	}
}
