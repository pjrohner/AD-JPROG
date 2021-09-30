package de.oio.java.gui.event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventDemo4 extends JFrame {

	private JButton button;

	public EventDemo4(String title) {
		super(title);

		button = new JButton("Klick mich!");
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		add(button);
		pack();
	}

	public static void main(String args[]) {
		EventDemo4 demo = new EventDemo4("EventDemo 4");
		demo.setVisible(true);
	}

}
