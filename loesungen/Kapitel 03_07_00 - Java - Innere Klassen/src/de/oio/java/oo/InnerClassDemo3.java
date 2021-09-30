package de.oio.java.oo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);

		JButton button = new JButton("Klick mich!");
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		add(button);
		pack();
	}
	
}

public class InnerClassDemo3 {
	public static void main(String[] args) {
		new MyFrame("Test").setVisible(true);
	}
}