package de.oio.java.oo;

class S {
	int x = 0;
}

class T extends S {
	int x = 1;
}

public class Binding2 {
	
	static String info(String name, Object t) {
		return " wenn " + name + " zur Laufzeit ein Objekt vom Typ '" + t.getClass().getSimpleName() + "' hält.";
	}
	
	public static void main(String[] args) {
		T t = new T();
		System.out.println("t.x = " + t.x + info("t", t));

		S s = new S();
		System.out.println("s.x = " + s.x + info("s", s));

		s = t;
		System.out.println("s.x = " + s.x + info("s", s));
	}

}
