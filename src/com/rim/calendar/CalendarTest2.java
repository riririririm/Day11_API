package com.rim.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //현재시간을 담고있음
		cal.set(1995, 10, 14);
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
	
	}

}
