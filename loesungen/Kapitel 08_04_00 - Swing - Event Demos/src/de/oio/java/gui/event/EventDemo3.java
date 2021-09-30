package de.oio.java.gui.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo3 extends JFrame {

	private JButton button;

	/**
	 * Konstruktor.
	 * 
	 * @param title
	 *            Titel des Fensters
	 */
	public EventDemo3(String title) {
		super(title);

		button = new JButton("Klick mich!");
		button.addMouseListener(new ButtonMouseAdapter());
		add(button);
		pack();
	}

	public static void main(String args[]) {
		EventDemo3 demo = new EventDemo3("EventDemo 3");
		demo.setVisible(true);
	}

}

/**
 * Adapter-Klasse.
 */
class ButtonMouseAdapter extends MouseAdapter {

	public void mouseClicked(MouseEvent event) {
		System.exit(0);
	}

}
