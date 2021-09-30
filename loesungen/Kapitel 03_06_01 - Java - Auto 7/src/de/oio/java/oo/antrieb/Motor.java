package de.oio.java.oo.antrieb;

public class Motor {
	
	private static final int DREHZAHL_SCHRITT = 100;
	
	private String baureihe;
	
	private int drehzahl;
	
	private boolean istAn;
	
	public Motor() {
		baureihe = "Motor";
		drehzahl = 0;
		istAn = false;
	}
	
	protected String getBaureihe() {
		return baureihe;
	}
	
	protected int getDrehzahl() {
		return drehzahl;
	}
	
	protected void starten() {
		if (!istAn) {
			istAn = true;
		}
		drehzahl = 0;
	}
	
	protected void stoppen() {
		drehzahl = 0;
		if (istAn) {
			istAn = false;
		}
	}
	
	protected void steigern() {
		if (istAn) {
			drehzahl += DREHZAHL_SCHRITT;
		}
	}
	
	protected void senken() {
		if (istAn && drehzahl >= DREHZAHL_SCHRITT) {
			drehzahl -= DREHZAHL_SCHRITT;
		}
	}

}
