package de.oio.java.gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo2 extends JFrame implements ActionListener  {

	private JButton button;

	/**
	 * Konstruktor.
	 * 
	 * @param title
	 *            Titel des Fensters
	 */
	public EventDemo2(String title) {
		super(title);

		button = new JButton("Klick mich!");
		button.addActionListener(this);
		add(button);
		pack();
	}
	
	/**
	 * Methode aus ActionListener.
	 */
	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}

	public static void main(String args[]) {
		EventDemo2 demo = new EventDemo2("EventDemo 2");
		demo.setVisible(true);
	}

}
