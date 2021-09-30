package de.oio.java.oo;

public class AutoPrg {

	void vergleicheHersteller(Auto a, Auto b) {
		System.out.println("--- Vergleiche Hersteller ---");
		System.out.println("Hersteller Auto 1: " + a.hersteller);
		System.out.println("Hersteller Auto 2: " + b.hersteller);
		if (a.hersteller.equals(b.hersteller)) {
			System.out.println("Hersteller sind gleich.");
		} else {
			System.out.println("Hersteller sind NICHT gleich.");
		}
		if (a.hersteller == b.hersteller) {
			System.out.println("Hersteller sind dieselben.");
		} else {
			System.out.println("Hersteller sind NICHT dieselben.");
		}
	}

	void go() {
		Auto[] autos = new Auto[4];
		autos[0] = new Auto("VW", "Golf", 1.83);
		autos[1] = new Auto("BMW", "M3", 1.92);
		autos[2] = new Auto("Porsche", "Carrera 4", 1.87);
		autos[3] = new Auto("VW", "Passat", 1.90);
		
		vergleicheHersteller(autos[0], autos[1]);
		vergleicheHersteller(autos[0], autos[3]);
		vergleicheHersteller(autos[2], autos[2]);
		
		System.out.println("--- toString() ---");
		for (int i = 0; i < autos.length; i++) {
			System.out.println(autos[i].toString());
		}
	}

	public static void main(String[] args) {
		AutoPrg prg = new AutoPrg();
		prg.go();
	}

}
