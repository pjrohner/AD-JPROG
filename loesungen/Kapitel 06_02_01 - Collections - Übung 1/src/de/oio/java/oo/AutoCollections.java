package de.oio.java.oo;

import java.util.Collection;
import java.util.HashSet;

import de.oio.java.oo.produkte.Auto;
import de.oio.java.oo.produkte.Cabrio;
import de.oio.java.oo.produkte.Farbe;

public class AutoCollections {

	@SuppressWarnings("unchecked")
	private void go() {
		Collection autos = new HashSet();
		autos.add(new Auto("VW", "Golf", 1.83, Farbe.blau));
		autos.add(new Auto("BMW", "M3", 1.92, Farbe.rot));
		autos.add(new Cabrio("Porsche", "Carrera 4", 1.87, Farbe.schwarz));
		autos.add(new Auto("VW", "Passat", 1.90, Farbe.weiss));
		autos.add(new Cabrio("Mercedes", "SLK", 1.75, Farbe.schwarz));
	}

	public static void main(String[] args) {
		AutoCollections prg = new AutoCollections();
		prg.go();
	}

}
