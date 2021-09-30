package de.oio.java.gui.swing;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Elements extends JFrame {

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
		
		// Listener registrieren
		
		addWindowListener(new ElementsWindowListener());
	}

	
	/**
	 * Main-Methode. Wird von der VM aufgerufen.
	 * 
	 * @param args
	 *            Argumente der Kommandozeile
	 */
	public static void main(String args[]) {
		// Instanz der Swing-Anwendung erzeugen
		JFrame frame = new Elements("Swing Elements");
		// Instanz auf "sichtbar" schalten
		frame.setVisible(true);
	}

}
