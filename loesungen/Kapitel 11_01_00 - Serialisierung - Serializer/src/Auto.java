import java.io.Serializable;

class Auto implements Serializable {

	static transient int raeder = 4;

	private String hersteller;

	private String typ;

	private transient double breite;
	
	private String farbe;

	public Auto(String hersteller, String typ, double breite, String farbe) {
		this.hersteller = hersteller;
		this.typ = typ;
		this.breite = breite;
		this.farbe = farbe;
	}

	public void drucken() {
		System.out.println("Hersteller: " + hersteller);
		System.out.println("Type      : " + typ);
		System.out.println("Raeder    : " + raeder);
		System.out.println("Breite    : " + breite);
		System.out.println("Farbe     : " + farbe);
	}

	public void fahren() {
		System.out.println("Das Auto fährt ...");
	}

}