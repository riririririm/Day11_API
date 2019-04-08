package com.rim.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest6 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		String pattern = "yyyy년 MM월 dd일 HH:mm E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		
//		long now = calendar.getTimeInMillis();
//		Date date = new Date();
//		date.setTime(now);
		
		Date date = calendar.getTime();
		
		
		String result = sd.format(date);
		System.out.println(result);
		
	}

}
