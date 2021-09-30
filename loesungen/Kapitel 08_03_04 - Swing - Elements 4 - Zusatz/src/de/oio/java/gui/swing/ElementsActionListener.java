package de.oio.java.gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class ElementsActionListener implements ActionListener{

	private Elements elements;
	
	public ElementsActionListener(Elements elements) {
		this.elements = elements;
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() instanceof JMenuItem) {
			String command = event.getActionCommand();
			if ("Neu".equals(command)) {
			}
			if ("Beenden".equals(command)) {
				System.exit(0);
			}
			if ("Über".equals(command)) {
				String message = "Elements ist eine einfache Anwendung.";
				JOptionPane.showMessageDialog(elements, message, "Über Elements", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
