package de.oio.java.gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class ElementsActionListener implements ActionListener{

	public void actionPerformed(ActionEvent event) {
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
	}

}
