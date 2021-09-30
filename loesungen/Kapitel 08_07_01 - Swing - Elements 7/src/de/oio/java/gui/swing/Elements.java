package de.oio.java.gui.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
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
		pane.setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel(new FlowLayout());
		textField = new JTextField(20);
		topPanel.add(textField);
		addButton = new JButton("Hinzufügen");
		topPanel.add(addButton);
		pane.add(topPanel, BorderLayout.NORTH);

		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(list);
		pane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel footerPanel = new JPanel(new FlowLayout());
		delButton = new JButton("Löschen");
		footerPanel.add(delButton);
		delAllButton = new JButton("Liste leeren");
		footerPanel.add(delAllButton);
		pane.add(footerPanel, BorderLayout.SOUTH);
		
		pack();
		
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
