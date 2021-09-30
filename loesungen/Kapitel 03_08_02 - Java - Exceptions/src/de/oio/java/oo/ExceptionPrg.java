package de.oio.java.oo;

public class ExceptionPrg {

	public static void main(String[] args) {
		Benutzer benutzer = new Benutzer();
		benutzer.setBenutzername("Dieter");
		System.out.println(benutzer.getBenutzername());
		benutzer.setPasswort("totalgeheim");
		System.out.println(benutzer.getPasswort());
		benutzer.setBenutzername("Dieter Develop");
		System.out.println(benutzer.getBenutzername());
		benutzer.setPasswort("geheim");
		System.out.println(benutzer.getPasswort());
	}

}
