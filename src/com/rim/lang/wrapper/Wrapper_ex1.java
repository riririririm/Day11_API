package com.rim.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex1 {

	Scanner sc = new Scanner(System.in);

	// 주민번호입력
	// 1. 나이?
	// 2. 3~5:봄 6~8:여름 9~11:가을 12~1:겨울
	public void ex1() {
		System.out.println("주민번호 입력:");
		String num = sc.next();
		String mm = num.substring(2, 4);
		String season = null;

		int index = num.indexOf('-');
		index++;
		String yy = num.substring(index, index + 1);

		int year = Integer.parseInt(yy);
		int month = Integer.parseInt(mm);

		yy = num.substring(0, 2);
		int temp = Integer.parseInt(yy);

		if (year == 3 || year == 4) {
			temp += 2000;

		} else if (year == 1 || year == 2) {
			temp += 1900;
		}

		System.out.println(temp);
		int age = 2019 - temp;

		System.out.println(age);

		if (month >= 3 && month <= 5)
			season = "봄";
		else if (month >= 6 && month <= 8)
			season = "여름";
		else if (month >= 9 && month <= 11)
			season = "가을";
		else if (month == 12 || month == 1 || month == 2)
			season = "겨울";

		System.out.println(season);
	}

	public void ex2() {
		// 비밀번호입력
		// 대소문자, 숫자 각 1개씩 이상, 공백은ㄴㄴ
		// 최소6자 이상 -> 비번으로 사용가능하도록

		System.out.println("pw:");
		String pw = sc.nextLine();
		int up = 0, low = 0, num = 0, space = 0;

		if (pw.length() >= 6) {// 6자리 이상이면
			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				if (Character.isUpperCase(ch) == true)
					up += 1;
				else if (Character.isLowerCase(ch) == true)
					low += 1;
				else if (Character.isDigit(ch) == true)
					num += 1;
				else if (Character.isWhitespace(ch) == true)
					space += 1;
			}

			if (up > 0 && low > 0 && num > 0 && space == 0) {
				System.out.println("대문자:" + up);
				System.out.println("소문자:" + low);
				System.out.println("숫자:" + num);
				System.out.println("공백:" + space);
			}else {
				System.out.println("다시 설정하세요");
			} 
		} else
			System.out.println("6자리 이상으로 설정해주세요");

	}

}
