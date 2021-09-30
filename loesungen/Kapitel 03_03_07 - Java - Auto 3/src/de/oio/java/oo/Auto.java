package de.oio.java.oo;

public class Auto {
	
	String hersteller;
	
	String typ;
	
	double breite;
	
	int raeder;
	
	String farbe;
	
	public Auto(String hersteller, String typ, double breite, int raeder) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
		this.raeder = raeder;
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
	
}