package de.oio.java.gui.swing;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ElementsListSelectionListener implements ListSelectionListener {

	private Elements elements;
	
	public ElementsListSelectionListener(Elements elements) {
		this.elements = elements;
	}
	
	public void valueChanged(ListSelectionEvent event) {
		elements.textField.setText((String) elements.list.getSelectedValue());
	}

}
