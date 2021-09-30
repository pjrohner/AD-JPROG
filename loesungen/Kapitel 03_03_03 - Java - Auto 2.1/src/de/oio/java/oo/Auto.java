package de.oio.java.oo;

public class Auto {
	
	String hersteller;
	
	String typ;
	
	double breite;
	
	int raeder;
	
	String farbe;
	
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
	
}