package de.oio.java.gui.event;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EventDemo5 extends JFrame {

	public EventDemo5(String title) {
		super(title);

		ExitAction exitAction = new ExitAction();

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Datei");
		fileMenu.add(new JMenuItem(exitAction));
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		JButton button = new JButton(exitAction);
		add(button);
		pack();
	}

	public static void main(String args[]) {
		EventDemo5 demo = new EventDemo5("EventDemo 5");
		demo.setVisible(true);
	}
}

class ExitAction extends AbstractAction {
	
	public ExitAction() {
		super("Beenden");
		putValue(Action.SHORT_DESCRIPTION, "Beendet diese Anwendung");
	}

	public void actionPerformed(ActionEvent event) {
		System.exit(0);
	}
	
}
