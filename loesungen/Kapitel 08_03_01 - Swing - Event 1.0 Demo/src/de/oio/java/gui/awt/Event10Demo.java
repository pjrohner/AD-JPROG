package de.oio.java.gui.awt;

import java.awt.Event;
import java.awt.Frame;

class Event10Demo extends Frame {
	
	private Event10Demo(String title) {
		super(title);
		setSize(400, 200);
	}

	public boolean handleEvent(Event event) {
		System.out.println(event);
		return super.handleEvent(event);
	}

	public static void main(String args[]) {
		Event10Demo demo = new Event10Demo("Java 1.0 Event Demo");
		demo.setVisible(true);
	}
}
