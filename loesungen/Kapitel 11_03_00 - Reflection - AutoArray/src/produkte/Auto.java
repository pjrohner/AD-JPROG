package produkte;

import antrieb.Automotor;

public class Auto {

	double breite;

	static int raeder = 4;

	String hersteller;

	String typ;

	String color;

	static int autoAnzahl;

	private Automotor am;

	public Auto(String hersteller, String typ, double breite /*,int raeder*/) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
		autoAnzahl++;
	}

	public Auto(String hersteller, String typ, double breite, Automotor am) {
		this(hersteller, typ, breite);
		this.am = am;
	}

	double getBreite() {
		return breite;
	}

	static int getRaeder() {
		return raeder;
	}

	void setBreite(double neuBreite) {
		breite = neuBreite;
	}

	public void drucken() {
		System.out.println("====Autoprospekt=====");
		System.out.println("Hersteller: " + hersteller);
		System.out.println("Type      : " + typ);
		System.out.println("Raeder    : " + getRaeder());
		System.out.println("Breite    : " + getBreite());
	}

	public void fahren() {
		System.out.println("Stickig und mit Klopapierrolle");
		if (am == null) {
			System.out.println("Ich habe leider keinen Motor, Fahrt vorbei...");
		} else {
			am.losfahren();
			am.beschleunigen();
			am.beschleunigen();
			am.bremsen();
			am.anhalten();
		}
	}

	void paintCar() {
		color = "schwarz";
		System.out.println("Ich bin rabenschwarz !");
	}

	void paintCar(String color) {
		this.color = color;
		System.out.println("Ich bin " + color + "  !");
	}

	public boolean equals(Object obj) {
		if (obj instanceof Auto) {
			Auto a = (Auto) obj;
			if (hersteller.equals(a.hersteller) && typ.equals(a.typ)
					&& breite == a.breite)
				return true;
		}
		return false;
	}

}