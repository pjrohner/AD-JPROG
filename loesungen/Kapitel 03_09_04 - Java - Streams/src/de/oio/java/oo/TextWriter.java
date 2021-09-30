package de.oio.java.oo;

import java.io.*;
import java.util.*;

public class TextWriter {
	
	private BufferedReader br;

	public TextWriter() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void readData() {
		try {
			System.out.print("Dateiname eingeben: ");
			String filename = br.readLine();
			System.out.print("Text eingeben     : ");
			String text = br.readLine();
			saveData(filename, text);
			
		} catch (IOException e) {
			System.err.println("Ein Fehler ist aufgetreten.");
			System.exit(1);
		
		} finally {
			try { br.close(); } catch (IOException e) { e.printStackTrace(); }
		}
	}

	private void saveData(String filename, String text) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileOutputStream(filename + ".txt", true));
			pw.println("Eintrag am: " + Calendar.getInstance().getTime());
			pw.println(text);
			pw.flush();
			System.out.println("Speichervorgang beendet.");
			
		} catch (IOException e) {
			System.err.println("Ein Fehler ist aufgetreten.");
			System.exit(2);
		
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}

	public static void main(String[] args) {
		TextWriter textWriter = new TextWriter();
		textWriter.readData();
	}
}