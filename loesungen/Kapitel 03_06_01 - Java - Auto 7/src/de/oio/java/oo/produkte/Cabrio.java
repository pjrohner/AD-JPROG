package de.oio.java.oo.produkte;

import de.oio.java.oo.antrieb.SportwagenMotor;

public class Cabrio extends Auto {
	
	private SportwagenMotor motor;

	public Cabrio(String hersteller, String typ, double breite) {
		super(hersteller, typ, breite);
		
		this.motor = new SportwagenMotor();
	}
	
	public void drucken() {
		System.out.println("-- Cabrio --");
		System.out.println("Hersteller: " + getHersteller());
		System.out.println("Typ       : " + getTyp());
		System.out.println("Breite    : " + getBreite());
		System.out.println("Räder     : " + getRaeder());
		System.out.println("Motor     : " + motor.getBaureihe());
	}
	
	public void fahren() {
		System.out.println("Das Cabrio '" + toString() + "' fährt ...");
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

}
