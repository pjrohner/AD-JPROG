import java.io.Serializable;

public class Cabrio extends Auto implements Serializable {

	public Cabrio(String hersteller, String typ, double breite, String farbe) {
		super(hersteller, typ, breite, farbe);
	}

	public void fahren() {
		System.out.println("Das Cabrio fährt ...");
	}
	
}
