package de.oio.java.gui.awt;

import java.awt.Frame;

public class Elements extends Frame {

	/**
	 * Konstruktor.
	 * 
	 * @param title
	 *            Titel des Fensters
	 */
	public Elements(String title) {
		super(title);
		// Grösse des Fensters setzen
		setSize(290, 205);
	}
	
	/**
	 * Main-Methode. Wird von der VM aufgerufen.
	 * 
	 * @param args
	 *            Argumente der Kommandozeile
	 */
	public static void main(String args[]) {
		// Instanz der Anwendung erzeugen
		Frame frame = new Elements("AWT Elements");
		// Instanz auf "sichtbar" schalten
		frame.setVisible(true);
	}
}
