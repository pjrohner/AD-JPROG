package de.oio.java.oo;

import de.oio.java.oo.produkte.Auto;
import de.oio.java.oo.produkte.Cabrio;
import de.oio.java.oo.produkte.Farbe;

public class AutoPaket {

	private void go() {
		Auto a1 = new Auto("BMW", "M3", 1.92, Farbe.rot);
		Cabrio c1 = new Cabrio("Porsche", "Carrera 4", 1.87, Farbe.blau);
		
		a1.drucken();
		c1.drucken();
	}

	public static void main(String[] args) {
		AutoPaket prg = new AutoPaket();
		prg.go();
	}

}
