package de.oio.java.oo;

public class AutoOO {

	void go() {
		Auto a1 = new Auto("VW", "Golf", 1.83);
		Auto a2 = new Auto("VW", "Golf", 1.83);
		
		if (a1 == a2) {
			System.out.println("a1 und a2 sind dasselbe Auto.");
		} else {
			System.out.println("a1 und a2 sind NICHT dasselbe Auto.");
		}
		if (a1.equals(a2)) {
			System.out.println("a1 und a2 sind das gleiche Auto.");
		} else {
			System.out.println("a1 und a2 sind NICHT das gleiche Auto.");
		}
	}

	public static void main(String[] args) {
		AutoOO prg = new AutoOO();
		prg.go();
	}

}
