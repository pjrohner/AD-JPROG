package de.oio.java.gui.swing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class Elements extends JFrame {

	JMenuBar menuBar;
	JMenu file, help;
	JMenuItem fileNew, fileExit, helpAbout;

	/**
	 * Konstruktor.
	 * 
	 * @param title
	 *            Titel des Fensters
	 */
	public Elements(String title) {
		super(title);
		setSize(290, 205);
		// Standardverhalten für X-Knopf des Fensters einstellen
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		// Menü anlegen
		
		menuBar = new JMenuBar();
		
		file = new JMenu("Datei");
		fileNew = new JMenuItem("Neu");
		file.add(fileNew);
		fileExit = new JMenuItem("Beenden");
		file.add(fileExit);
		menuBar.add(file);
		
		help = new JMenu("Hilfe");
		helpAbout = new JMenuItem("�ber");
		help.add(helpAbout);
		menuBar.add(help);
		
		setJMenuBar(menuBar);
		
		// Listener registrieren
		
		addWindowListener(new ElementsWindowListener());
		
		ElementsActionListener actionListener = new ElementsActionListener();
		fileNew.addActionListener(actionListener);
		fileExit.addActionListener(actionListener);
		helpAbout.addActionListener(actionListener);
	}

	/**
	 * Main-Methode. Wird von der VM aufgerufen.
	 * 
	 * @param args
	 *            Argumente der Kommandozeile
	 */
	public static void main(String args[]) {
		// Instanz der Anwendung erzeugen
		JFrame frame = new Elements("Swing Elements");
		// Instanz auf "sichtbar" schalten
		frame.setVisible(true);
	}

}
