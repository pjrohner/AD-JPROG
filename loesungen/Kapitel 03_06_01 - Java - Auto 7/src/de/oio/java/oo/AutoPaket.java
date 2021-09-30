package de.oio.java.oo;

import de.oio.java.oo.produkte.Auto;
import de.oio.java.oo.produkte.Cabrio;

public class AutoPaket {

	private void go() {
		Auto a1 = new Auto("BMW", "M3", 1.92);
		Cabrio c1 = new Cabrio("Porsche", "Carrera 4", 1.87);
		
		a1.drucken();
		a1.fahren();
		c1.drucken();
		c1.fahren();
	}

	public static void main(String[] args) {
		AutoPaket prg = new AutoPaket();
		prg.go();
	}

}
