package de.oio.java.oo;

class Rechner {
	
	public void ausgabe() {
		
		final int zahl = 10;

		class InnererRechner {
			public int getQuadrat() {
				return (zahl * zahl);
			}
		}

		InnererRechner iRechner = new InnererRechner();
		System.out.println(iRechner.getQuadrat());
	}
	
}

public class InnerClassDemo2 {
	
	public static void main(String[] args) {
		Rechner rechner = new Rechner();
		rechner.ausgabe();
	}
	
}
