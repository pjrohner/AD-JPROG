import java.io.Serializable;

public class Auto implements Serializable, Cloneable {

	transient double breite;

	static transient int raeder = 4;

	String hersteller;

	public String typ;

	String color;

	static int autoAnzahl;

	public Auto(String hersteller, String typ, double breite /*,int raeder*/
	) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
		autoAnzahl++;
	}

	public Auto() {
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

	void paintCar() {
		color = "schwarz";
		System.out.println("Ich bin rabenschwarz !");
	}

	void paintCar(String color) {
		this.color = color;
		System.out.println("Ich bin " + color + "  !");
	}

	void drucken() {
		System.out.println("Hersteller: " + hersteller);
		System.out.println("Type      : " + typ);
		System.out.println("Raeder    : " + getRaeder());
		System.out.println("Breite    : " + getBreite());
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

	void fahren() throws Exception {
		System.out.println("Stickig und mit Klopapierrolle");
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getTyp() {
		return typ;
	}
}