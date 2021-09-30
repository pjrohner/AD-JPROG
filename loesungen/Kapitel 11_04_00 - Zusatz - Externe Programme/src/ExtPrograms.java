import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * Diese Klasse zeigt 3 Möglichkeiten um externe Anwendungen aus einer
 * Java-Anwendung heraus zu starten.
 * 
 */
public class ExtPrograms {

	/** Die externe Anwendung, welche ausgeführt werden soll: Windows Notepad */
	private String command = System.getenv("windir") + "\\system32\\notepad.exe";
	
	/**
	 * Externe Anwendung über Klasse Runtime (seit Java 1.0) ausführen.
	 * 
	 * @throws IOException
	 *             z.B. wenn die Anwendung nicht gefunden wird
	 */
	private void go1() throws IOException {
		Runtime runtime = Runtime.getRuntime();
		
		runtime.exec(command); // Prozess starten
	}

	/**
	 * Externe Anwendung über Klasse ProcessBuilder (seit Java 1.5) ausführen.
	 * Bietet noch mehr Möglichkeiten der Interaktion und Steuerung.
	 * 
	 * @throws IOException
	 *             z.B. wenn die Anwendung nicht gefunden wird
	 */
	private void go2() throws IOException {
		ProcessBuilder builder = new ProcessBuilder(command);
//		builder.directory(new File("...")); // Verzeichnis, in dem die Anwendung ausgeführt wird
		
		builder.start(); // Prozess starten

//		Process process = builder.start();						// Process-Instanz liefert Interaktionsmöglichkeiten
//		InputStream inputStream = process.getInputStream();
//		OutputStream outputStream = process.getOutputStream();
//		InputStream errorStream = process.getErrorStream();
//		int exitValue = process.exitValue();
//		process.destroy();
	}

	/**
	 * Externe Anwendung über Klasse Desktop (seit Java 1.6) ausführen.
	 * Bietet nur bestimmte Anwendungen an - vor allem um Dateien mit der
	 * verknöpften Standard-Anwendung auszuführen oder zu öffnen.
	 * 
	 * @throws Exception
	 *             wenn Fehler auftreten
	 */
	private void go3() throws Exception {
		Desktop desktop = Desktop.getDesktop();
		
		desktop.browse(new URI("http://www.oio.de/"));				// Standard-Browser öffnen
		desktop.edit(new File("test.txt"));							// Standard-Anwendung zum Bearbeiten des Dateityps öffnen
		desktop.mail(new URI("mailto:vorname.name@domain.tld"));	// Standard-Email-Anwendung öffnen
		desktop.open(new File("test.pdf"));							// Standard-Anwendung zur Anzeige des Dateityps öffnen
	}
	
	/**
	 * Main-Methode.
	 * 
	 * @param args
	 *            Kommandozeilenparameter
	 * @throws Exception
	 *             wenn Fehler auftreten
	 */
	public static void main(String[] args) throws Exception {
		ExtPrograms program = new ExtPrograms();
		program.go1();
//		program.go2();
//		program.go3();
	}

}
