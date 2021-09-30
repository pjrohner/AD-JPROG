package de.oio.java.threads;

public class Bank {

	private int[] konten;

	public Bank() {
		konten = new int[] {100, 50, 30};
	}

	public synchronized void ueberweise(int von, int nach, int betrag) {
		int neuerBetrag;
		
		System.out.println("Überweise von " + von + " nach " + nach + ": " + betrag + " EUR.");

		neuerBetrag = konten[von];
		neuerBetrag -= betrag;
		buerokratie();
		konten[von] = neuerBetrag;

		neuerBetrag = konten[nach];
		neuerBetrag += betrag;
		buerokratie();
		konten[nach] = neuerBetrag;
	}

	public void druckeAuszuege() {
		System.out.println("Auszug: " + konten[0] + ", " + konten[1] + ", " + konten[2]);
		System.out.println("Summe : " + (konten[0] + konten[1] + konten[2]));
	}
	
	private void buerokratie() {
		try {
			Thread.sleep(((int) (Math.random())) * 1000);
			
		} catch (InterruptedException e) { }
	}
	
}