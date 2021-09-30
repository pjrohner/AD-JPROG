package de.oio.java.threads;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class FadeFrameExtended extends JFrame implements Runnable, ActionListener {

	private String text = "Herzlich Willkommen!";

	private Font font = new Font("Arial", Font.BOLD, 25);

	private int helligkeit = 255;
	
	private Thread fadeThread;

	private FadeFrameExtended() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(350, 150);
		
		Container contentPane = getContentPane();
		
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton button = new JButton("Starten");
		button.addActionListener(this);
		buttonPanel.add(button);
		contentPane.add(buttonPanel, BorderLayout.NORTH);
		
		JPanel graphicsPanel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				paintText((Graphics2D) g);
			}
		};
		graphicsPanel.setBackground(Color.WHITE);
		contentPane.add(graphicsPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public void run() {
		try {
		} catch (Exception ex) { }
		
		while (helligkeit >= 3) {
			helligkeit = helligkeit - 3;
			
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception ex) { }
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		helligkeit = 255;
		fadeThread = new Thread(this);
		fadeThread.start();
	}
	
	private void paintText(Graphics2D graphics) {
		Color color = new Color(helligkeit, helligkeit, 255);
		
		graphics.setColor(color);
		graphics.setFont(font);
		graphics.drawString(text, 30, 50);
	}

	public static void main(String[] args) {
		new FadeFrameExtended();
	}

}