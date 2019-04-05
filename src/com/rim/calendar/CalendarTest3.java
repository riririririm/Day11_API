package com.rim.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); 
		Calendar cal2 = Calendar.getInstance();
		
		//cal2.add(Calendar.DATE, 2);
		cal.set(1995, 11, 14);
		
		long l = cal.getTimeInMillis();
		long l2 = cal2.getTimeInMillis();
		System.out.println(l);
		System.out.println(l2);
		long l3 = l2-l;
		
		System.out.println(l3/(1000*60*60*24));
		
		
	
	}

}
