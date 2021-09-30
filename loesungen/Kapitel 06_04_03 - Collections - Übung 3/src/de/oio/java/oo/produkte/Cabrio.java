package de.oio.java.oo.produkte;

import de.oio.java.oo.antrieb.SportwagenMotor;

public class Cabrio extends Auto {
	
	private SportwagenMotor motor;

	public Cabrio(String hersteller, String typ, double breite, Farbe farbe) {
		super(hersteller, typ, breite, farbe);
		
		this.motor = new SportwagenMotor();
	}
	
	public void drucken() {
		System.out.println("-- Cabrio --");
		System.out.println("Hersteller: " + getHersteller());
		System.out.println("Typ       : " + getTyp());
		System.out.println("Breite    : " + getBreite());
		System.out.println("Räder     : " + getRaeder());
		System.out.println("Farbe     : " + getFarbe());
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Cabrio) {
			Cabrio c = (Cabrio) obj;
			if (getHersteller().equals(c.getHersteller()) 
					&& getTyp().equals(c.getTyp()) 
					&& getBreite() == c.getBreite()
					&& getFarbe() == c.getFarbe()) {

				return true;
			}
		}
		return false;
	}

}
