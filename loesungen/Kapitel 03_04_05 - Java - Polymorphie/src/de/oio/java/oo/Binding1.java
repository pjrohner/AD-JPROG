package de.oio.java.oo;

class T1 {
	int x = 1;
}

class T2 extends T1 {
	int x = 2;
}

class T3 extends T2 {
	int x = 3;

	void test() {
		System.out.println("x            = " + x);
		System.out.println("super.x      = " + super.x);
		System.out.println("((T2)this).x = " + ((T2) this).x);
		System.out.println("((T1)this).x = " + ((T1) this).x);
	}
}

public class Binding1 {
	public static void main(String[] args) {
		new T3().test();
	}
}
