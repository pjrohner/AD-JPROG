package de.oio.java.oo;

public class Zahlen1 {
	
	static int LOOP = 1000000;
	
	void go() {
		Integer[] i = new Integer[LOOP];

		long anfang = System.currentTimeMillis();
		for (int x = 0; x < LOOP; x++) {
			i[x] = new Integer(x);
		}
		long ende = System.currentTimeMillis();
		
		System.out.println("Zeit: " + (ende - anfang) + " ms");
	}

	public static void main(String args[]) {
		new Zahlen1().go();
	}
	
}
