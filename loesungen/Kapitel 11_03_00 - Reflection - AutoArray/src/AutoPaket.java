import java.lang.reflect.Array;

import produkte.*;
import antrieb.Automotor;

class AutoPaket {

	Auto[] autos = new Auto[3];

	Cabrio c;

	Automotor am;

	public void go() {

		am = new Automotor();

		autos[0] = new Auto("VW", "Golf", 1.81);
		autos[1] = new Auto("Mercedes", "E 230", 2.1, am);
		autos[2] = new Auto("Fiat", "500", 0.5);

		for (int x = 0; x < autos.length; x++) {
			autos[x].drucken();
			autos[x].fahren();
		}

		c = new Cabrio("Porsche", "911-Cabrio", 1.9);
		c.drucken();
		c.fahren();

		autos = changeArraySize(autos);

		autos[3] = new Auto("VW", "Beetle", 1.81);
		autos[4] = new Auto("BMW", "Z4", 1.87, am);
		autos[5] = new Auto("Porsche", "Cayenne Turbo", 1.93, am);

		System.out
				.println("++++++++++++++ nach Array-Erweiterung ++++++++++++++++++++++");

		for (int x = 0; x < autos.length; x++) {
			autos[x].drucken();
			autos[x].fahren();
		}

	}

	private Auto[] changeArraySize(Auto[] autos) {

		Class c = autos.getClass();
		int doubleLength = autos.length * 2;
		Auto[] newAutos;

		Object autosArrayObject = Array.newInstance(c.getComponentType(),
				doubleLength);

		newAutos = (Auto[]) autosArrayObject;

		copyArrayToArray(autos, newAutos);

		return newAutos;
	}

	private void copyArrayToArray(Auto[] original, Auto[] copy) {
		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}
	}

	public static void main(String[] args) {
		new AutoPaket().go();
	}
}