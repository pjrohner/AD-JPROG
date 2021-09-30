package de.oio.java.oo.antrieb;

public class SportwagenMotor extends AutoMotor {

	private String baureihe;
	
	public SportwagenMotor() {
		baureihe = "SportwagenMotor";
	}
	
	public String getBaureihe() {
		return baureihe;
	}
	
	public void beschleunigen() {
		steigern();
		steigern();
	}
	
	public void bremsen() {
		senken();
		senken();
	}
	
	public void tacho() {
		System.out.println("Geschwindigkeit: " + getDrehzahl() / 10 + " km/h");
		System.out.println("Drehzahl       : " + getDrehzahl() + " U/min");
	}
	
}
