package de.oio.java.oo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DateienKopie {

	public static void main(String[] args) throws IOException {

		File inputFile = new File("original.txt");
		File outputFile = new File("kopie.txt");

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);

		int c;
		while ((c = in.read()) != -1)
			out.write(c);

		in.close();
		out.close();
	}
	
}
