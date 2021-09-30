package antrieb;

class Motor {

	private boolean runs;

	String baureihe;

	protected int drehzahl;

	Motor() {
		runs = false;
		baureihe = "Motor";
		drehzahl = 0;
	}

	void starten() {
		runs = true;
		leistungsteigern();
	}

	void stop() {
		drehzahl = 0;
		runs = false;
	}

	protected void leistungsteigern() {
		if (runs) {
			drehzahl = drehzahl + 1000;
		}
	}

	protected void leistungsenken() {
		if (drehzahl > 1000) {
			drehzahl = drehzahl - 1000;
		} else {
			drehzahl = 0;
			runs = false;
		}

	}
}