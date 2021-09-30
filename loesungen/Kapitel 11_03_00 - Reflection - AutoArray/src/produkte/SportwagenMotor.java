package produkte;

import antrieb.Automotor;

class SportwagenMotor extends Automotor {

	private String baureihe = "Sportwagenmotor";

	SportwagenMotor() {
		System.out.println(baureihe + " besetzt den Platz seines Vaters "
				+ super.baureihe);
	}

	public void beschleunigen() {
		super.beschleunigen();
		leistungsteigern();
	}

	public void bremsen() {
		leistungsenken();
		super.bremsen();
	}

	protected void tacho() {
		System.out.println("Drehzahl: " + drehzahl + "U/min");
		super.tacho();
	}

}