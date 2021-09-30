package de.oio.java.oo;

public class Zahlen2 {
	
	static int LOOP = 1000000;
	
	void go() {
		int[] i = new int[LOOP];

		long anfang = System.currentTimeMillis();
		for (int x = 0; x < LOOP; x++) {
			i[x] = x;
		}
		long ende = System.currentTimeMillis();
		
		System.out.println("Zeit: " + (ende - anfang) + " ms");
	}

	public static void main(String args[]) {
		new Zahlen2().go();
	}
	
}
