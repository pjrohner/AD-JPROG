package de.oio.java.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExtendedJdbc {
	
	private Connection connection;
	
	private String dbDriver = "org.h2.Driver";
	private String dbUrl = "jdbc:h2:tcp://localhost/oio";
	private String dbUser = "sa";
	private String dbPasswd = "";
	
	public void go() {
		openConnection();
		
		String sql = "SELECT * FROM seminar WHERE duration=?";
		
		try {
			PreparedStatement prepStmt = connection.prepareStatement(sql);
			
			System.out.println("Seminarabfragen - zum Abbrechen bitte 'exit' eingeben.");
			
			while (true) {
				String input = printMessageAndReadString("Dauer der Seminare");
				if ("exit".equals(input)) {
					break;
				}
				
				int duration;
				try {
					duration = Integer.parseInt(input);
				} catch (NumberFormatException e) {
					System.out.println("Mach' kein Blödsinn!");
					continue;
				}
				
				prepStmt.setInt(1, duration);
				ResultSet result = prepStmt.executeQuery();
				
				System.out.println("Seminare mit " + duration + " Tagen Dauer:");
				while (result.next()) {
					System.out.println("Titel: " + result.getString("title"));
				}
				System.out.println();
			}
			
			System.out.println("Seminarabfragen - Beendet.");
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		
		} finally {
			closeConnection();
		}
		
	}
	
	private String printMessageAndReadString(String message) {
		System.out.print(message + ": ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = in.readLine();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return line;
	}
	
	private void openConnection() {
		try {
			Class.forName(dbDriver);
			
		} catch (ClassNotFoundException ex) {
			System.err.println("Driver class not found!");
			System.exit(1);
			return;
		}
		
		try {
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPasswd);

		} catch (SQLException ex) {
			ex.printStackTrace();
			System.exit(1);
			return;
		}
	}
	
	private void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		ExtendedJdbc program = new ExtendedJdbc();
		program.go();
	}
	
}