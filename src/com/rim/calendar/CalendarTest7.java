package com.rim.calendar;

import java.awt.font.TransformAttribute;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest7 {

	public static void main(String[] args) throws ParseException {
		String now ="2020-05-05";
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sd.parse(now);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(date);
	}

}
