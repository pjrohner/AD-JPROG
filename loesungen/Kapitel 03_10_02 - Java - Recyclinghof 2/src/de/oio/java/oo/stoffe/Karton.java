package de.oio.java.oo.stoffe;

public class Karton extends Muell implements Recyclebar {

	private String inhalt;
	
	public Karton(float gewicht) {
		super(gewicht);
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Karton ");
		if (inhalt == null) {
			sb.append("(leer)");
		} else {
			sb.append("(").append(inhalt).append(")");
		}
		return sb.toString();
	}
	
	public void trennen() {
		System.out.println("Trenne Karton und Inhalt ...");
		System.out.println("Inhalt: " + inhalt);
	}

	public void verwerten() {
		System.out.println("Verwerte Karton ...");
	}
	
}
