package antrieb;

public class Automotor extends Motor {

	protected String baureihe = "Automotor";

	public Automotor() {
		System.out.println(baureihe + " stammt von " + super.baureihe);
	}

	public void losfahren() {
		starten();
		System.out.println("Fahrer startet");
		tacho();
	}

	public void anhalten() {
		stop();
		System.out.println("Fahrer hält an");
		tacho();
	}

	public void beschleunigen() {
		leistungsteigern();
		System.out.println("Fahrer gibt Gas");
		tacho();
	}

	public void bremsen() {
		leistungsenken();
		System.out.println("Fahrer bremst");
		tacho();
	}

	protected void tacho() {
		int a = drehzahl / 100;
		System.out.println("Geschwingigkeit: " + a + " km/h");
	}
}