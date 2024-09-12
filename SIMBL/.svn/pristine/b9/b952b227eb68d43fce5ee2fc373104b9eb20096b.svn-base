package frame.toolbar.tools;

import javax.swing.JButton;
import javax.swing.JToolBar;

import helpers.Helper;
import listeners.UredjivanjeMenuActionListener;


public class ToolsForUredjivanjeDijagrama extends JToolBar{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton undoBtn = null;
	JButton redoBtn = null;
	JButton cutBtn = null;
	JButton copyBtn = null;
	JButton pasteBtn = null;
	UredjivanjeMenuActionListener actionListener = null;
	
	public ToolsForUredjivanjeDijagrama() {
		setFloatable(false);
		
		actionListener = new UredjivanjeMenuActionListener();
		
		undoBtn = new JButton();
		undoBtn.setToolTipText("Ponisti poslednju promjenu");
		undoBtn.setIcon(Helper.getIconFromName("arrow_undo"));
		undoBtn.setActionCommand("ponisti prethodni korak");
		undoBtn.addActionListener(actionListener);
		
		redoBtn = new JButton();
		redoBtn.setToolTipText("Povrati ponisteni korak");
		redoBtn.setIcon(Helper.getIconFromName("arrow_redo"));
		redoBtn.setActionCommand("povrati ponisteni korak");
		redoBtn.addActionListener(actionListener);
		
		cutBtn = new JButton();
		cutBtn.setToolTipText("Isjeci");
		cutBtn.setIcon(Helper.getIconFromName("cut"));
		cutBtn.setActionCommand("isjecanje");
		cutBtn.addActionListener(actionListener);
		
		copyBtn = new JButton();
		copyBtn.setToolTipText("Kopiraj");
		copyBtn.setIcon(Helper.getIconFromName("clipboard_text"));
		copyBtn.setActionCommand("kopiranje");
		copyBtn.addActionListener(actionListener);
		
		pasteBtn = new JButton();
		pasteBtn.setToolTipText("Zalijepi");
		pasteBtn.setIcon(Helper.getIconFromName("clipboard_paste_image"));
		pasteBtn.setActionCommand("lijepljenje");
		pasteBtn.addActionListener(actionListener);
		
		add(undoBtn);
		add(redoBtn);
		add(copyBtn);
		add(pasteBtn);
		add(cutBtn);
	}

}
