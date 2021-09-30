package de.oio.java.oo;

import java.util.Calendar;
import java.util.Date;

public class DatingGame1 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31); // Jahr, Monat, Tag
		
		System.out.print(cal.get(Calendar.YEAR) + " ");
		Date d = cal.getTime();
		System.out.println(d.getDay());
	}

}
