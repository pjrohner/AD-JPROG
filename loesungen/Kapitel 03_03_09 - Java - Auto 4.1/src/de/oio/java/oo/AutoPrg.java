package de.oio.java.oo;

public class AutoPrg {

	void swap(Auto a, Auto b) {
		Auto t;
		t = a;
		a = b;
		b = t;
		System.out.println("Auto a = b: " + a.hersteller);
		System.out.println("Auto b = a: " + b.hersteller);
	}

	void realSwap(Auto[] a) {
		Auto t = a[0];
		a[0] = a[2];
		a[2] = t;
		System.out.println("Array-Auto a[0] = a[2]: " + a[0].hersteller);
		System.out.println("Array-Auto a[2] = a[0]: " + a[2].hersteller);
	}

	void go() {
		Auto[] autos = new Auto[3];
		autos[0] = new Auto("VW", "Golf", 1.83);
		autos[1] = new Auto("BMW", "M3", 1.92);
		autos[2] = new Auto("Porsche", "Carrera 4", 1.87);

		System.out.println("1. Auto-Hersteller vor swap(): " + autos[0].hersteller);
		System.out.println("2. Auto-Hersteller vor swap(): " + autos[2].hersteller);
//		swap(autos[0], autos[2]);
		realSwap(autos);
		System.out.println("1. Auto-Hersteller nach swap(): " + autos[0].hersteller);
		System.out.println("2. Auto-Hersteller nach swap(): " + autos[2].hersteller);
	}

	public static void main(String[] args) {
		AutoPrg prg = new AutoPrg();
		prg.go();
	}

}
