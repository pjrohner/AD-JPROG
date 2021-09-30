package de.oio.java.gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ElementsListener implements ActionListener, ListSelectionListener {

	private Elements elements;
	
	public ElementsListener(Elements elements) {
		this.elements = elements;
	}
	
	/** ActionListener. */
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
				String message = "Elements ist eine einfache Anwendung.";
				JOptionPane.showMessageDialog(elements, message, "Über Elements", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		// Der Button "Hinzufügen" wurde gedrückt
		if (event.getSource() == elements.addButton) {
			String text = elements.textField.getText();
			if (text != null && !"".equals(text)) {
				elements.listModel.addElement(text);
			}
			elements.textField.setText(null);
			elements.textField.requestFocus();
		}
		
		// Der Button "Löschen" wurde gedrückt
		if (event.getSource() == elements.delButton) {
			int selectedIndex = elements.list.getSelectedIndex();
			if (selectedIndex >= 0) {
				elements.listModel.remove(selectedIndex);
			}
			elements.textField.setText(null);
			elements.textField.requestFocus();
		}
		
		// Der Button "Liste leeren" wurde gedrückt
		if (event.getSource() == elements.delAllButton) {
			elements.listModel.clear();
			elements.textField.setText(null);
			elements.textField.requestFocus();
		}
	}
	
	/** ListSelectionListener. */
	public void valueChanged(ListSelectionEvent event) {
		elements.textField.setText((String) elements.list.getSelectedValue());
	}

}
