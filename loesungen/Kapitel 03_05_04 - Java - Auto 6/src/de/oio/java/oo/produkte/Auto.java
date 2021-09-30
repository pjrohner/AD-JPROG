package de.oio.java.oo.produkte;

public class Auto {

	static int raeder = 4;
	
	String hersteller;
	
	String typ;
	
	double breite;
	
	String farbe;
	
	public Auto(String hersteller, String typ, double breite) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
	}
	
	void setBreite(double breite) {
		this.breite = breite;
	}

	void lackiereAuto() {
		farbe = "schwarz";
		System.out.println("Ich wurde " + farbe + " lackiert!");
	}
	
	void lackiereAuto(String neueFarbe) {
		farbe = neueFarbe;
		System.out.println("Ich wurde " + farbe + " lackiert!");
	}
	
	void drucken() {
		System.out.println("-- Auto --");
		System.out.println("Hersteller: " + hersteller);
		System.out.println("Typ       : " + typ);
		System.out.println("Breite    : " + breite);
		System.out.println("Räder     : " + raeder);
	}
	
	public void fahren() {
		System.out.println("Das Auto '" + toString() + "' fährt ...");
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(hersteller).append(" ").append(typ).append(" - ").append(breite).append("m");
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Auto) {
			Auto a = (Auto) obj;
			if (hersteller.equals(a.hersteller) 
					&& typ.equals(a.typ) 
					&& breite == a.breite) {

				return true;
			}
		}
		return false;
	}
	
}