public class Dose extends Muell implements Recyclable {

	private boolean doseOffen = false;

	public void oeffnen() {
		doseOffen = true;
		System.out.println("Oeffnen Dose");
	}

	public String toString() {
		return "Dose";
	}

	public boolean istGeoeffnet() {
		return doseOffen;
	}
}
