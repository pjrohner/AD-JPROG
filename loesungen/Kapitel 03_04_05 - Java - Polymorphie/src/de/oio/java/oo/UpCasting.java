package de.oio.java.oo;

class Auto {
	
	void fahren() {
		System.out.println("Auto.fahren() ...");
	}
	
}

class Cabrio extends Auto {

	void fahren() {
		System.out.println("Cabrio.fahren() ...");
	}

}

public class UpCasting {

	static void reisen(Auto a) {
		a.fahren();
	}

	public static void main(String[] args) {
		reisen(new Auto());
		reisen(new Cabrio());
	}

}
