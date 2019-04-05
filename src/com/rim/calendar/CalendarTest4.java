package com.rim.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance(); 
		Calendar cal2 = Calendar.getInstance(); 
		
		System.out.println("종료시간을 입력:");
		String time = sc.next();
		String[] times =time.split("-");
		int hour = Integer.parseInt(times[0]);
		int minute = Integer.parseInt(times[1]);
		
		cal2.set(Calendar.HOUR_OF_DAY, hour);
		cal2.set(Calendar.MINUTE, minute);
		
		System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE));
		System.out.println(cal2.get(Calendar.HOUR)+":"+cal2.get(Calendar.MINUTE));
		
		long start = cal.getTimeInMillis();
		long end = cal2.getTimeInMillis();
		
		
		long play =end-start;
		long m = play%(1000*60*60);
		long h = play/(1000*60*60);
		if(m>0) {
			h++;
		}
	
		
		System.out.println("이용시간:"+play/(1000*60*60));
		
		System.out.println("이용요금:"+h*1000);
	
		
	
	}

}
