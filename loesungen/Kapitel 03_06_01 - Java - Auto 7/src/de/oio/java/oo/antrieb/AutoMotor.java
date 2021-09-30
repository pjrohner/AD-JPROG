package de.oio.java.oo.antrieb;

public class AutoMotor extends Motor {

	private String baureihe;
	
	public AutoMotor() {
		baureihe = "AutoMotor";
	}
	
	public String getBaureihe() {
		return baureihe;
	}
	
	public void losfahren() {
		starten();
		steigern();
	}

	public void anhalten() {
		while (getDrehzahl() > 0) {
			senken();
		}
		stoppen();
	}
	
	public void beschleunigen() {
		steigern();
	}
	
	public void bremsen() {
		senken();
	}
	
	public void tacho() {
		System.out.println("Geschwindigkeit: " + getDrehzahl() / 10 + " km/h");
	}
	
}
