package de.oio.java.oo;

public class Cabrio extends Auto {

	public Cabrio(String hersteller, String typ, double breite) {
		super(hersteller, typ, breite);
	}
	
	@Override
	void fahren() {
		System.out.println("Das Cabrio '" + toString() + "' fährt ...");
	}

}
