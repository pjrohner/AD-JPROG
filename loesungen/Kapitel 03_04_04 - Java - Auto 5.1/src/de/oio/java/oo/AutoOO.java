package de.oio.java.oo;

public class AutoOO {

	void go() {
		Auto a1 = new Auto("VW", "Golf", 1.83);
		Auto a2 = new Auto("BMW", "M3", 1.92);
		Cabrio c1 = new Cabrio("Porsche", "Carrera 4", 1.87);
		
		a1.fahren();
		a2.fahren();
		c1.fahren();
	}

	public static void main(String[] args) {
		AutoOO prg = new AutoOO();
		prg.go();
	}

}
