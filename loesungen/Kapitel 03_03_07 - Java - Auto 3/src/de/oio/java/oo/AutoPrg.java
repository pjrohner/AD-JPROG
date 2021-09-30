package de.oio.java.oo;

public class AutoPrg {

	public static void main(String[] args) {
		Auto[] autos = new Auto[4];
		
		autos[0] = new Auto("VW", "Golf", 1.83, 4);
		autos[1] = new Auto("BMW", "M3", 1.92, 4);
		autos[2] = new Auto("Porsche", "Carrera 4", 1.87, 4);
		autos[3] = new Auto("Mercedes", "SL 400", 1.96, 4);
		
		for (int i = 0; i < autos.length; i++) {
			autos[i].drucken();
		}
	}

}
