package de.oio.java.oo.stoffe;

/**
 * Repräsentiert einen Karton mit Inhalt.
 * 
 * @author Dieter Develop
 * @version 0.1 alpha
 */
public class Karton extends Muell implements Recyclebar {

	/** Hält den Inhalt des Kartons als Zeichenkette. */
	private String inhalt;

	/**
	 * Konstruktor.
	 * 
	 * @param gewicht
	 *            Gewicht dieses Kartons.
	 */
	public Karton(float gewicht) {
		super(gewicht);
	}

	/**
	 * Gibt den Inhalt des Kartons als Zeichenkette zurück.
	 * 
	 * @return den Inhalt des Kartons als Zeichenkette
	 */
	public String getInhalt() {
		return inhalt;
	}

	/**
	 * Setzt den Inhalt des Kartons als Zeichenkette.
	 * 
	 * @param inhalt
	 *            Der Inhalt des Kartons als Zeichenkette.
	 */
	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	
	/**
	 * Gibt den String 'Karton', gefolgt von seinem Inhalt in Klammern, zurück.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Karton ");
		if (inhalt == null) {
			sb.append("(leer)");
		} else {
			sb.append("(").append(inhalt).append(")");
		}
		return sb.toString();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void trennen() {
		System.out.println("Trenne Karton und Inhalt ...");
		System.out.println("Inhalt: " + inhalt);
	}

	/**
	 * {@inheritDoc}
	 */
	public void verwerten() {
		System.out.println("Verwerte Karton ...");
	}
	
}
