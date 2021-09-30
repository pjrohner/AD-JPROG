package de.oio.java.oo.stoffe;


public class Auto {

	private static int raeder = 4;
	
	private String hersteller;
	
	private String typ;
	
	private double breite;
	
	
	public Auto(String hersteller, String typ, double breite) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
	}
	
	public void drucken() {
		System.out.println("-- Auto --");
		System.out.println("Hersteller: " + hersteller);
		System.out.println("Typ       : " + typ);
		System.out.println("Breite    : " + breite);
		System.out.println("Räder     : " + raeder);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(hersteller).append(" ").append(typ).append(" - ").append(breite).append("m");
		return builder.toString();
	}
	
}