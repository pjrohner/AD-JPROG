package de.oio.java.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo1 extends JFrame {

	private JButton button;

	/**
	 * Konstruktor.
	 * 
	 * @param title
	 *            Titel des Fensters
	 */
	public EventDemo1(String title) {
		super(title);

		button = new JButton("Klick mich!");
		button.addActionListener(new ButtonListener());
		add(button);
		pack();
	}

	public static void main(String args[]) {
		EventDemo1 demo = new EventDemo1("EventDemo 1");
		demo.setVisible(true);
	}

}

/**
 * Eigene Listener-Klasse.
 */
class ButtonListener implements ActionListener {

	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}

}
