package produkte;

public class Cabrio extends Auto {

	private SportwagenMotor swm;

	public Cabrio(String hersteller, String typ, double breite) {
		super(hersteller, typ, breite);
		swm = new SportwagenMotor();
	}

	public void fahren() {
		System.out.println("Mit wehendem Haar und dem Gefuehl von Freiheit");
		swm.losfahren();
		swm.beschleunigen();
		swm.beschleunigen();
		swm.bremsen();
		swm.anhalten();
	}

	public void drucken() {
		super.drucken();
		System.out.println("+====techn. Cabrioprospekt=====");
		System.out
				.println("Mein Klassenname ist: " + this.getClass().getName());
		System.out.println("Meine Oberklasse ist: "
				+ this.getClass().getSuperclass().getName());
		System.out.println("Deren Oberklasse ist: "
				+ this.getClass().getSuperclass().getSuperclass().getName());
	}

}