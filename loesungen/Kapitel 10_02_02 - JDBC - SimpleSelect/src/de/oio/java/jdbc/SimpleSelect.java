package de.oio.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelect {
	
	public static void main(String args[]) {
		try {
			Class.forName("org.h2.Driver");
			
		} catch (ClassNotFoundException ex) {
			System.err.println("Driver class not found!");
			return;
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:tcp://localhost/oio", "sa", "");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM SEMINAR");
			
			while (rs.next()) {
				System.out.println("Schulung: " + rs.getString(3) + ", Dauer: " + rs.getString("duration"));
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException ex) {
			ex.printStackTrace();

		} finally {
			if (con != null) {
				try { con.close(); } catch (SQLException ex) { ex.printStackTrace(); }
			}
		}
	}
	
}