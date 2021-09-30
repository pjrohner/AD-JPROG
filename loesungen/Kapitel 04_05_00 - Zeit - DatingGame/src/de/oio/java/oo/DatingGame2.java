package de.oio.java.oo;

import java.util.Calendar;

public class DatingGame2 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, Calendar.DECEMBER, 31); // Jahr, Monat, Tag
		
		System.out.print(cal.get(Calendar.YEAR) + " ");
		System.out.print(cal.get(Calendar.DAY_OF_MONTH));
	}

}
