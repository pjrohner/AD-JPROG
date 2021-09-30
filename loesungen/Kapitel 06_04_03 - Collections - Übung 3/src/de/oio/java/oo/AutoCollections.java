package de.oio.java.oo;

import java.util.*;

import de.oio.java.oo.produkte.Auto;
import de.oio.java.oo.produkte.Cabrio;
import de.oio.java.oo.produkte.Farbe;

public class AutoCollections {

	private void go() {
		List<Auto> autos = new ArrayList<Auto>();
		autos.add(new Auto("VW", "Golf", 1.83, Farbe.blau));
		autos.add(new Auto("BMW", "M3", 1.92, Farbe.rot));
		autos.add(new Cabrio("Porsche", "Carrera 4", 1.87, Farbe.schwarz));
		autos.add(new Auto("VW", "Passat", 1.90, Farbe.weiss));
		autos.add(new Cabrio("Mercedes", "SLK", 1.75, Farbe.schwarz));
		autos.add(new Auto("VW", "Passat", 1.90, Farbe.weiss));
		
		System.out.println("----- vorher -----");
		for (Iterator<Auto> i = autos.iterator(); i.hasNext();) {
			Auto auto = i.next();
			System.out.println(auto);
		}
		
		autos.removeAll(Collections.singleton(new Auto("VW", "Passat", 1.90, Farbe.weiss)));
		
		System.out.println("----- nachher -----");
		for (Iterator<Auto> i = autos.iterator(); i.hasNext();) {
			Auto auto = i.next();
			System.out.println(auto);
		}
		
		System.out.println("----- Unveränderliche Liste -----");
		List<Auto> unveraenderlicheAutos = Collections.unmodifiableList(autos);
		
		// Wirft eine UnsupportedOperationException
		unveraenderlicheAutos.remove(0);
	}

	public static void main(String[] args) {
		AutoCollections prg = new AutoCollections();
		prg.go();
	}

}
