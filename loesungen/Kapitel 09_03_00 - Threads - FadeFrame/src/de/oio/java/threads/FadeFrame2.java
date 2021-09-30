package de.oio.java.threads;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FadeFrame2 extends JFrame implements Runnable {

	private String text = "Herzlich Willkommen!";

	private Font font = new Font("Arial", Font.BOLD, 25);

	private int helligkeit = 255;
	
	private Thread fadeThread;

	private FadeFrame2() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300, 100);
		setBackground(Color.WHITE);
		
		setContentPane(new JComponent() {
			@Override
			public void paint(Graphics g) {
				paintText(g);
			}
		});
		
		setVisible(true);
		
		fadeThread = new Thread(this);
		fadeThread.start();
	}

	public void run() {
		while (helligkeit >= 3) {
			helligkeit = helligkeit - 3;
			
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception ex) { }
		}
	}
	
	private void paintText(Graphics graphics) {
		Color color = new Color(helligkeit, helligkeit, 255);
		
		graphics.setColor(color);
		graphics.setFont(font);
		graphics.drawString(text, 20, 35);
	}
	
	public static void main(String[] args) {
		new FadeFrame2();
	}

}