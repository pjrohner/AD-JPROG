package de.oio.java.oo.produkte;

import de.oio.java.oo.antrieb.AutoMotor;

public class Auto {

	private static int raeder = 4;
	
	private String hersteller;
	
	private String typ;
	
	private double breite;
	
	private String farbe;
	
	private AutoMotor motor;
	
	public Auto(String hersteller, String typ, double breite) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
		
		this.motor = new AutoMotor();
	}
	
	protected String getHersteller() { return hersteller; }
	protected String getTyp() { return typ; }
	protected double getBreite() { return breite; }
	protected static int getRaeder() { return raeder; }
	
	public void lackiereAuto() {
		farbe = "schwarz";
		System.out.println("Ich wurde " + farbe + " lackiert!");
	}
	
	public void lackiereAuto(String neueFarbe) {
		farbe = neueFarbe;
		System.out.println("Ich wurde " + farbe + " lackiert!");
	}
	
	public void drucken() {
		System.out.println("-- Auto --");
		System.out.println("Hersteller: " + hersteller);
		System.out.println("Typ       : " + typ);
		System.out.println("Breite    : " + breite);
		System.out.println("Räder     : " + raeder);
		System.out.println("Motor     : " + motor.getBaureihe());
	}
	
	public void fahren() {
		System.out.println("Das Auto '" + toString() + "' fährt ...");
		motor.losfahren();
		motor.tacho();
		motor.beschleunigen();
		motor.tacho();
		motor.beschleunigen();
		motor.tacho();
		motor.beschleunigen();
		motor.tacho();
		motor.bremsen();
		motor.tacho();
		motor.anhalten();
		motor.tacho();
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