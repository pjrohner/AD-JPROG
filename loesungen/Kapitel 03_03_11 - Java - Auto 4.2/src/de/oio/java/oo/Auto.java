package de.oio.java.oo;

public class Auto {

	static int instanzenZaehler = 0;
	
	static int raeder = 4;
	
	String hersteller;
	
	String typ;
	
	double breite;
	
	String farbe;
	
	public Auto(String hersteller, String typ, double breite) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
		
		instanzenZaehler++;
	}

	String getHersteller() {
		return hersteller;
	}
	
	String getTyp() {
		return typ;
	}
	
	double getBreite() {
		return breite;
	}
	
	int getRaeder() {
		return raeder;
	}
	
	void setBreite(double neueBreite) {
		breite = neueBreite;
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
	
	public String toString() {
		StringBuilder builder = new StringBuilder("Auto: ");
		builder.append(hersteller).append(" ").append(typ).append(" - ").append(breite).append("m");
		return builder.toString();
	}
	
}