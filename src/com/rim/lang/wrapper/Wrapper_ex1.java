package com.rim.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	Scanner sc = new Scanner(System.in);
	
	//주민번호입력
	//1. 나이?
	//2. 3~5:봄   6~8:여름  9~11:가을   12~1:겨울
	public void ex1() {
		System.out.println("주민번호 입력:");
		String num=sc.next();
		String yy = num.substring(0,2);
		String mm = num.substring(2,4);
		String season = null;
		
		int year = Integer.parseInt(yy);
		int month = Integer.parseInt(mm);
		
		if(year/10 !=0) 
			yy="19"+yy;
		else 
			yy="20"+yy;
		
		year= Integer.parseInt(yy);
		int age = 2019-year;
		
		System.out.println(age);
		
		if(month>=3 && month<=5)
			season="봄";
		else if(month>=6 && month<=8)
			season="여름";
		else if(month>=9 && month<=11)
			season="가을";
		else if(month==12 || month==1 || month==2)
			season="겨울";
			
		System.out.println(season);
	}
	
	
}
