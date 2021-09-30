package de.oio.java.oo.stoffe;

/**
 * Dieses Interface ermöglicht einer Klasse im Recyclinghof recycelt zu werden.
 * Es stellt sicher, dass entsprechende Methoden vorhanden sind, die vom
 * Recyclinghof benötigt werden um den entsprechenden Wertstoff korrekt zu
 * trennen und anschliessend zu verwerten. Umstritten ist, ob dieses Interface
 * dahingehend Sinn macht, dass es dem Wertstoff selbst die Möglichkeit sich zu
 * recyceln gibt oder nicht besser ein Marker-Interface verwendet werden sollte.
 * 
 * @author Dieter Develop
 * @version 0.1 alpha
 */
public interface Recyclebar {

	/**
	 * Der entsprechende Wertstoff muss in dieser Methode seine Trennung von
	 * anderen Bestandteilen (Inhalt, Verpackung etc.) implementieren.
	 */
	public void trennen();

	/**
	 * Der entsprechende Wertstoff muss in dieser Methode seine konkrete
	 * Verwertung implementieren. Diese Methode darf nur an bereits getrennten
	 * Wertstoffen aufgerufen werden.
	 */
	public void verwerten();

}
