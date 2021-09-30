package de.oio.java.oo;

import de.oio.java.oo.MeineKlasse.InnereKlasse;

class MeineKlasse {
	
	public String einName = "Mein Name";

	private int eineZahl = 1234;
	
	public InnereKlasse getInnereKlasse() {
		InnereKlasse innen = new InnereKlasse();
		innen.einName = innen.einePrivateMethode();
		return innen;
	}

	private String einePrivateMethode() {
		return "Zeichenkette Klasse";
	}

	class InnereKlasse {
		
		private String einName;

		public void gibWasAus() {
			System.out.println("Privates Attribut der äusseren Klasse   : " + eineZahl);
			System.out.println("Private Methode der äusseren Klasse     : " + MeineKlasse.this.einePrivateMethode());
			System.out.println("Mein Attribut                           : " + einName);
			System.out.println("Überdecktes Attribut der äusseren Klasse: " + MeineKlasse.this.einName);
		}
		
		private String einePrivateMethode() {
			return "Zeichenkette InnereKlasse";
		}
	}
}

public class InnerClassDemo1 {
	
	public static void main(String[] args) {
		MeineKlasse aussen = new MeineKlasse();
		InnereKlasse innereKlasse = aussen.getInnereKlasse();
		innereKlasse.gibWasAus();
	}
	
}
