package de.oio.java.gui.swing;

import java.awt.Container;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.WindowConstants;

public class Elements extends JFrame {

	JMenuBar menuBar;
	JMenu file, help;
	JMenuItem fileNew, fileExit, helpAbout;

	JTextField textField;
	JList list;
	JButton addButton, delButton, delAllButton;
	DefaultListModel listModel;

	/**
	 * Konstruktor.
	 * 
	 * @param title
	 *            Titel des Fensters
	 */
	public Elements(String title) {
		super(title);
		setSize(290, 230);
		// Standardverhalten für X-Knopf des Fensters einstellen
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Menü anlegen
		
		menuBar = new JMenuBar();
		
		file = new JMenu("Datei");
		fileNew = new JMenuItem("Neu");
		file.add(fileNew);
		fileExit = new JMenuItem("Beenden");
		file.add(fileExit);
		menuBar.add(file);
		
		help = new JMenu("Hilfe");
		helpAbout = new JMenuItem("Über");
		help.add(helpAbout);
		menuBar.add(help);
		
		setJMenuBar(menuBar);
		
		// Komponenten erzeugen und auf der Anwendung platzieren
		
		Container pane = getContentPane();
		pane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(15, 15, 140, 20);
		pane.add(textField);
		
		addButton = new JButton("Hinzufügen");
		addButton.setBounds(165, 15, 100, 20);
		pane.add(addButton);

		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(15, 45, 250, 95);
		pane.add(scrollPane);
		
		delButton = new JButton("Löschen");
		delButton.setBounds(15, 150, 90, 20);
		pane.add(delButton);
		
		delAllButton = new JButton("Liste leeren");
		delAllButton.setBounds(115, 150, 120, 20);
		pane.add(delAllButton);
		
		// Listener registrieren
		
		ElementsListener elementsListener = new ElementsListener(this);
		fileNew.addActionListener(elementsListener);
		fileExit.addActionListener(elementsListener);
		helpAbout.addActionListener(elementsListener);
		
		addButton.addActionListener(elementsListener);
		list.addListSelectionListener(elementsListener);
		delButton.addActionListener(elementsListener);
		delAllButton.addActionListener(elementsListener);
	}

	/**
	 * Main-Methode. Wird von der VM aufgerufen.
	 * 
	 * @param args
	 *            Argumente der Kommandozeile
	 */
	public static void main(String args[]) {
		// Instanz der Swing-Anwendung erzeugen
		JFrame frame = new Elements("Swing Elements");
		// Instanz auf "sichtbar" schalten
		frame.setVisible(true);
	}

}
