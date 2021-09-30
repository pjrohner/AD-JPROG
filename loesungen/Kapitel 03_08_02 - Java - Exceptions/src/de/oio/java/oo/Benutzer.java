package de.oio.java.oo;

public class Benutzer {
	
	private String benutzername;
	
	private String passwort;

	public String getBenutzername() {
		return benutzername;
	}

	public void setBenutzername(String benutzername) {
		try {
			checkBenutzername(benutzername);
			this.benutzername = benutzername;
		} catch (BenutzernameException e) {
			System.out.println("Ausnahme: " + e.getMessage());
			System.out.println("Der Benutzername wird auf 8 Zeichen gekürzt!");
			this.benutzername = benutzername.substring(0, 8);
		}
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		checkPasswort(passwort);
		this.passwort = passwort;
	}
	
	private void checkBenutzername(String benutzername) throws BenutzernameException {
		if (benutzername.length() > 8) {
			throw new BenutzernameException("Der Benutzername ist zu lang.");
		}
	}
	
	private void checkPasswort(String passwort) {
		if (passwort.length() < 8) {
			throw new RuntimeException("Das Passwort hat zu wenig Zeichen.");
		}
	}

}
