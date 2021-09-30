package de.oio.java.oo;

public class AutoPrg {

	public static void main(String[] args) {
		Auto meinAuto = new Auto();
		meinAuto.hersteller = "VW";
		meinAuto.typ = "Golf";
		meinAuto.raeder = 4;
		meinAuto.breite = 1.83;
		
		System.out.println("Mein Auto - Hersteller: " + meinAuto.hersteller);
		System.out.println("Mein Auto - Typ       : " + meinAuto.typ);
		System.out.println("Mein Auto - Räder     : " + meinAuto.raeder);
		System.out.println("Mein Auto - Breite    : " + meinAuto.breite);
	}

}
