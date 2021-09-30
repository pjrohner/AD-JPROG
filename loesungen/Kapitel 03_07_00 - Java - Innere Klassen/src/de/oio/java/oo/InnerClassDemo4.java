package de.oio.java.oo;

class Auto {
	
	static class Motor {
		public void druckeLeistung() {
			System.out.println("Leistung = 300 PS");
		}
	}
	
}

public class InnerClassDemo4 {
	
	public static void main(String[] args) {
		Auto.Motor motor = new Auto.Motor();
		motor.druckeLeistung();
	}
}
