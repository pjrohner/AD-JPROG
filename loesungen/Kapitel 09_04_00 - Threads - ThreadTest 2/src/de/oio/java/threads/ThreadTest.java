package de.oio.java.threads;

public class ThreadTest implements Runnable {

	private Bank bank;

	private ThreadTest(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		int k1 = ((int) (Math.random() * 1000)) % 3;
		int k2 = ((int) (Math.random() * 1000)) % 3;
		bank.ueberweise(k1, k2, 50);
	}
	
	public static void main(String[] args) {
		Bank meineBank = new Bank();

		new Thread(new ThreadTest(meineBank)).start();
		new Thread(new ThreadTest(meineBank)).start();
		new Thread(new ThreadTest(meineBank)).start();

		meineBank.druckeAuszuege();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { }
		
		meineBank.druckeAuszuege();
	}
	
}
