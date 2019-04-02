package com.rim.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex3 {
	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 주민번호 입력
		// 마지막 번호는 체크용 번호로 따로 저장
		// 9 5 1 2 0 3 - 1 2 3 4 5 6 7
		// *2 3 4 5 6 7 8 9 2 3 4 5
		// = 18 + 15 + 4 + 10 + 0 + 21 + 8 + 18 + 6 + 2 + 20 + 30
		// 위의 합산 결과를 11로 나눈 나머지 구하기
		// 11에서 나머지를 -한 값을 (만약 이 결과가 두자리수라면 10으로 나눈 나머지를 체크용번호와 비교)
		// 그 결과가 체크용번호와 동일하면 정상적인 번호.

		System.out.println("주민번호 입력:");
		String jumin = sc.next();

		// jumin=jumin.replaceAll("-","");

		int sum = 0;
		int j = 2;
		int num = 0;

		for (int i = 0; i < jumin.length() - 1; i++) {
			char ch = jumin.charAt(i); // 문자 하나하나
			String n = String.valueOf(ch);

			if (Character.isDigit(ch)) { // 숫자면
				num = Integer.parseInt(n);

				sum = sum + num * j;
				if (j == 10)
					j = 2;
				j++;

			} else
				continue;
		} // end of for

		System.out.println("----------------------");

		int result = sum % 11;
		if (result / 10 > 0) {
			// 두자리수면
			result = 11 - result % 10;
		} else
			result = 11 - result;

		int last_num = Integer.parseInt(jumin.substring(13));

		if (result == last_num)
			System.out.println("올바른 주민번호입니다.");
		else
			System.out.println("올바르지 않은 주민번호입니다.");
	}

}
