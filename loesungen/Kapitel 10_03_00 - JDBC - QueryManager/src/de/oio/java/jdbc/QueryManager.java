package de.oio.java.jdbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class QueryManager extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Container contenPane;
	
	private JTextField textField;
	private JButton button;
	private JTable table;
	private JDialog dialog;

	private String driver = "org.h2.Driver";
	private String url = "jdbc:h2:tcp://localhost/oio";
	
	public QueryManager() {
		try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException ex) {
			System.err.println("Driver class not found!");
			return;
		}
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		contenPane = getContentPane();
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		textField = new JTextField(30);
		panel.add(textField);
		button = new JButton("Query");
		button.addActionListener(this);
		panel.add(button);
		
		contenPane.add(panel, BorderLayout.NORTH);
		
		table = new JTable();
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setWheelScrollingEnabled(true);
		
		contenPane.add(scrollPane, BorderLayout.CENTER);
	}
	
	private void queryDbAndSetTable(String sql) {
		Connection con = null;
			
		try {
			con = DriverManager.getConnection(url, "sa", "");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			Vector<String> columnNames = new Vector<String>();
			for (int i = 1; i <= columnCount; i++) {
				columnNames.add(metaData.getColumnName(i));
			}
			
			Vector<Vector<String>> data = new Vector<Vector<String>>();
			while (rs.next()) {
				Vector<String> row = new Vector<String>();
				for (int i = 1; i <= columnCount; i++) {
					row.add(rs.getString(i));
				}
				data.add(row);
			}
			
			TableModel tableModel = new DefaultTableModel(data, columnNames);
			table.setModel(tableModel);
			
			rs.close();
			stmt.close();

		} catch (SQLException ex) {
			popupMessage(ex.getMessage());

		} finally {
			if (con != null) {
				try { con.close(); } catch (SQLException ex) { ex.printStackTrace(); }
			}
		}
	}
	
	private void popupMessage(String text) {
		dialog = new JDialog(this, "Warnung!", true);
		dialog.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		dialog.setBackground(Color.WHITE);
		
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JTextArea textArea = new JTextArea(text);
		panel1.add(textArea);
		panel1.setBackground(Color.WHITE);
		dialog.add(panel1, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton button = new JButton("OK");
		button.addActionListener(this);
		panel2.add(button);
		panel2.setBackground(Color.WHITE);
		dialog.add(panel2, BorderLayout.SOUTH);
		
		dialog.pack();
		dialog.setVisible(true);
	}
	
	private void closeMessage() {
		dialog.setVisible(false);
		dialog.dispose();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if ("Query".equals(e.getActionCommand())) {
			String sql = textField.getText();
			if ((sql != null) && (!"".equals(sql))) {
				
				if ((sql.length() >= 6) && "SELECT".equalsIgnoreCase(sql.substring(0, 6))) {
					queryDbAndSetTable(sql);
				} else {
					popupMessage("Bitte nur SELECT-Statements verwenden.");
				}
			}
		}
		if ("OK".equals(e.getActionCommand())) {
			closeMessage();
		}
		
	}
	
	public static void main(String[] args) {
		QueryManager manager = new QueryManager();
		manager.pack();
		manager.setVisible(true);
	}

}
