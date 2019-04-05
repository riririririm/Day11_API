package com.rim.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar ca = Calendar.getInstance();
		ca.set(2019, 3, 1);
		int date = ca.get(Calendar.DAY_OF_WEEK)-1;
	
		int max = ca.getActualMaximum(Calendar.DATE);
		//System.out.println(max);
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<date;i++) {
			System.out.print("\t");
		}
		for(int i=1;i<=max;i++) {
			System.out.print(i+"\t");
//			ca.set(Calendar.DATE, i);
//			if(ca.get(Calendar.DAY_OF_WEEK)%7==0)
//				System.out.println();
			if((i+date)%7==0)
				System.out.println();
			
		}
		
		
		
	
		
	
	}

}
