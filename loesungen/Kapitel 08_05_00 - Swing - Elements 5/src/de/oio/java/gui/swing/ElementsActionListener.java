package de.oio.java.gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class ElementsActionListener implements ActionListener{

	private Elements elements;
	
	public ElementsActionListener(Elements elements) {
		this.elements = elements;
	}
	
	public void actionPerformed(ActionEvent event) {
		// Eine Menüeintrag wurde ausgewählt
		if (event.getSource() instanceof JMenuItem) {
			String command = event.getActionCommand();
			if ("Neu".equals(command)) {
			}
			if ("Beenden".equals(command)) {
				System.exit(0);
			}
			if ("Über".equals(command)) {
			}
		}
		
		// Der Button wurde gedrückt
		if (event.getSource() == elements.button) {
			String text = elements.textField.getText();
			if (text != null && !"".equals(text)) {
				elements.listModel.addElement(text);
			}
			elements.textField.setText(null);
			elements.textField.requestFocus();
		}
	}

}
