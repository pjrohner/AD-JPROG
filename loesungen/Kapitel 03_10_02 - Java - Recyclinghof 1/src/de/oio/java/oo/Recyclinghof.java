package de.oio.java.oo;

import de.oio.java.oo.stoffe.Auto;
import de.oio.java.oo.stoffe.Dose;
import de.oio.java.oo.stoffe.Karton;
import de.oio.java.oo.stoffe.Muell;

public class Recyclinghof {

	public void trennen(Object wertstoff) {
		System.out.println("Ich trenne ....");
		
		if (wertstoff instanceof Muell) {
			System.out.println("Es ist Müll.");
			Muell m = (Muell) wertstoff;
			System.out.println("Müll wiegt: " + m.getGewicht());
		}
		
		if (wertstoff instanceof Dose) {
			System.out.println("Es ist eine Dose.");
			Dose d = (Dose) wertstoff;
			d.oeffnen();
		}
		
		if (wertstoff instanceof Karton) {
			System.out.println("Es ist ein Karton.");
			Karton k = (Karton) wertstoff;
			System.out.println("Inhalt des Kartons: " + k.getInhalt());
		}
		
		if (wertstoff instanceof Auto) {
			System.out.println("Es ist ein Auto.");
			Auto a = (Auto) wertstoff;
			System.out.println("Auto: " + a);
		}
	}

	public void wiederverwerten(Object wertstoff) {
		System.out.println("Ich verwerte: " + wertstoff);
	}
	
	public void go() {
		Object[] wertstoffe = new Object[5];
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
	
	public static void main(String[] args) {
		Recyclinghof hof = new Recyclinghof();
		hof.go();
	}
}
