package de.oio.java.oo;

import de.oio.java.oo.stoffe.Auto;
import de.oio.java.oo.stoffe.Dose;
import de.oio.java.oo.stoffe.Karton;
import de.oio.java.oo.stoffe.Muell;
import de.oio.java.oo.stoffe.Recyclebar;

/**
 * Die Klasse Recyclinghof stellt das Hauptprogramm dieser Anwendung dar. Ruft
 * man an ihr die Methode {@link #go()} auf, so werden verschiedene recyclebare
 * Objekte erzeugt und anschliessend den Methoden {@link #trennen(Recyclebar)}
 * und {@link #wiederverwerten(Recyclebar)} Übergeben, die diese entsprechend
 * bearbeiten.
 * 
 * @author Dieter Develop
 * @version 0.1 alpha
 */
public class Recyclinghof {

	/**
	 * Trennt den Übergebenen Wertstoff, der eine entsprechende Methode anbieten
	 * muss.
	 * 
	 * @param wertstoff
	 *            der zu trennende Wertstoff
	 */
	public void trennen(Recyclebar wertstoff) {
		System.out.println("Recyclinghof trennt:");
		
		if (wertstoff instanceof Muell) {
			Muell m = (Muell) wertstoff;
			System.out.println("Gewicht: " + m.getGewicht());
		}
		
		wertstoff.trennen();
	}

	/**
	 * Verwertet den Übergebenen Wertstoff, der eine entsprechende Methode
	 * anbieten muss.
	 * 
	 * @param wertstoff
	 *            der zu verwertende Wertstoff
	 */
	public void wiederverwerten(Recyclebar wertstoff) {
		System.out.println("Recyclinghof verwertet:");
		
		wertstoff.verwerten();
	}
	
	/**
	 * Initialisiert verschiedene Wertstoffe und recycelt sie anschliessend über
	 * die entsprechenden Methoden dieser Klasse.
	 * 
	 * @see #trennen(Recyclebar)
	 * @see #wiederverwerten(Recyclebar)
	 */
	public void go() {
		Recyclebar[] wertstoffe = new Recyclebar[5];
		wertstoffe[0] = new Dose(1.75f);
		wertstoffe[1] = new Karton(23.0f);
		((Karton) wertstoffe[1]).setInhalt("schwere Metallstücke");
		wertstoffe[2] = new Karton(2.5f);
		((Karton) wertstoffe[2]).setInhalt("Strümpfe");
		wertstoffe[3] = new Dose(0.33f);
		wertstoffe[4] = new Auto("VW", "Passat", 1.87);
		
		for (int i = 0; i < wertstoffe.length; i++) {
			trennen(wertstoffe[i]);
			wiederverwerten(wertstoffe[i]);
			System.out.println();
		}
	}
	
	/**
	 * Initialisiert einen Recyclinghof und ruft an ihm die Methode
	 * {@link #go()} auf.
	 * 
	 * @param args
	 *            Kommandozeilenparameter, werden hier nicht ausgewertet
	 */
	public static void main(String[] args) {
		Recyclinghof hof = new Recyclinghof();
		hof.go();
	}

}
