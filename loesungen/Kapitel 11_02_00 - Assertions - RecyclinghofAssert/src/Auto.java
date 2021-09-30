public class Auto implements Recyclable {

	static int zaehler;

	double breite;

	static int raeder;

	String hersteller;

	String typ;

	void setBreite(double abreite) {
		breite = abreite;
	}

	int getRaeder() {
		return raeder;
	}

	double getBreite() {
		return breite;
	}

	public void fahren() {
		System.out.println("Sie fahren in einem Auto");
	}

	public Auto(String hersteller, String typ) {

		this.hersteller = hersteller;
		this.typ = typ;
		Auto.raeder = 4;
		Auto.zaehler = ++Auto.zaehler;
	}

	public void print() {

		System.out.println("Hersteller    : " + hersteller);
		System.out.println("Type          : " + typ);
		System.out.println("Räder         : " + raeder);
		System.out.println("Breite        : " + getBreite());
		System.out.println("Instanznummer : " + zaehler);

	}

}