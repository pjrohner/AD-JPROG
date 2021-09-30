package de.oio.java.oo;

import de.oio.java.oo.produkte.Auto;
import de.oio.java.oo.produkte.Cabrio;

public class AutoPaket {

	void go() {
		Auto a1 = new Auto("VW", "Golf", 1.83);
		Auto a2 = new Auto("BMW", "M3", 1.92);
		Cabrio c1 = new Cabrio("Porsche", "Carrera 4", 1.87);
		
		a1.fahren();
		a2.fahren();
		c1.fahren();
	}

	public static void main(String[] args) {
		AutoPaket prg = new AutoPaket();
		prg.go();
	}

}
