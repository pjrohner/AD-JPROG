package de.oio.java.oo.stoffe;

public class Dose extends Muell {

	private boolean istOffen;
	
	public Dose(float gewicht) {
		super(gewicht);
		
		istOffen = false;
	}
	
	public boolean isOffen() {
		return istOffen;
	}

	public void oeffnen() {
		System.out.println("Öffne Dose ...");
		istOffen = true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dose ");
		if (istOffen) {
			sb.append("(geöffnet)");
		} else {
			sb.append("(nicht geöffnet)");
		}
		return sb.toString();
	}
	
}
