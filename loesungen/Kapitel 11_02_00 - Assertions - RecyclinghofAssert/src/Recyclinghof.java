import java.lang.reflect.Method;

public class Recyclinghof {

	public static void trennen(Recyclable rec) {
		if (rec instanceof Dose) {
			assert ((Dose) rec).istGeoeffnet() : "Dose ist noch ungeoeffnet !";
		} else {
			if (rec instanceof Karton) {
				assert (((Karton) rec).getInhalt() == null || ((Karton) rec)
						.getInhalt().equals("")) : "Im Karton ist noch Inhalt !";
			}
		}
		System.out.println(rec.toString() + " wird getrennt.");
	}

	public static void wiederverwerten(Recyclable rec) {
		System.out.println(rec.toString() + " wird wiederverwertet.");
	}

	public static void main(String args[]) {
		Dose d1 = new Dose();
		Karton k1 = new Karton();
		Auto a1 = new Auto("VW", "Golf");

		// Ein Interface-Array: how come?
		Recyclable[] gelberSack = new Recyclable[3];

		//		d1.oeffnen();
		//		k1.setInhalt("Überraschung");

		gelberSack[0] = k1;
		gelberSack[1] = d1;
		gelberSack[2] = a1;

		for (int i = 0; i < gelberSack.length; i++) {
			trennen(gelberSack[i]);
			wiederverwerten(gelberSack[i]);
		}

		d1.oeffnen();
		d1.gewicht = 5;
		d1.wiegen();

		k1.aufreissen();
		k1.setInhalt("Überraschung");
		k1.aufreissen();
		k1.gewicht = 3;
		k1.wiegen();

		Karton karton = (Karton) gelberSack[0];
		karton.aufreissen();

		a1.print();
		a1.fahren();

		// Introspection
		Class dieKlasse = gelberSack[1].getClass();

		Method[] ms;
		// jetzt haben wir ein Array voller Methodenobjekte der Klasse Karton
		ms = dieKlasse.getMethods();

		System.out.println("==============Action==============");
		for (int i = 0; i < ms.length; i++) {
			System.out.println(ms[i]);

			try {
				ms[i].invoke(gelberSack[1], new Object[0]);
			} catch (Exception e) {
				System.err.println(e.toString());
			}

		}

		System.out.println('\n' + "==============Cut=================");

	}
}