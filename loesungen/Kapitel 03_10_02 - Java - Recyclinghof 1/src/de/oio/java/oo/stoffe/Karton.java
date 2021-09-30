package de.oio.java.oo.stoffe;

public class Karton extends Muell {

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
	
}
