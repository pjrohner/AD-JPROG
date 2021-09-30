public class Karton extends Muell implements Recyclable {

	private String inhalt;

	public void aufreissen() {
		System.out.println("Karton enthält:  " + getInhalt());
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public String getInhalt() {
		return inhalt;
	}

	public String toString() {
		return "Karton";
	}
}
