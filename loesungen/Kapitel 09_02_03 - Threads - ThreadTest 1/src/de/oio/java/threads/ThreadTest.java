package de.oio.java.threads;

public class ThreadTest extends Thread {

	private String text;

	public ThreadTest(String text) {
		this.text = text;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(text);
			try {
				Thread.sleep(20);

			} catch (InterruptedException e) { }
		}
	}

	public static void main(String[] args) {
		new ThreadTest("Hase").start();
		new ThreadTest("Fuchs").start();
		new ThreadTest("Hund").start();
	}

}
