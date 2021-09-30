package de.oio.java.gui.awt;

import java.awt.Event;
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
	
	/** Java 1.0 Event-Handler. */
	public boolean handleEvent(Event event) {
		if (event.id == Event.WINDOW_DESTROY) {
			setVisible(false);	// Fenster verstecken
			dispose();			// Resourcen freigeben
			System.exit(0);		// Anwendung beenden
		}
		
		return super.handleEvent(event);
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
