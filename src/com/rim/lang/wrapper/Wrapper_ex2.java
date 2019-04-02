package com.rim.lang.wrapper;

import java.util.Scanner;

public class Wrapper_ex2 {
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
		
		jumin=jumin.replaceAll("-","");
		
		int[] num = new int[jumin.length()];

		for (int i = 0; i < jumin.length(); i++) {
			char ch = jumin.charAt(i);
			num[i] = Integer.parseInt(ch + "");
		} // end of for

		int last_index = num.length - 1;
		int last_num = num[last_index];
		int sum=0;
		
		System.out.println("----------------------");
		for (int i = 0; i < num.length-1; i++) {
			if (i+2 <= 9) {
				num[i] = num[i] * (i + 2);
			} else if (i+2 > 9) {
				num[i] = num[i] * (i - 6);
			}
			sum+=num[i];
		}
		
		int result = sum%11;
		if(result/10 >0) {
			//두자리수면
			result=11-result%10;
		}else
			result=11-result;               
		
		
		if(result==last_num)
			System.out.println("올바른 주민번호입니다.");
		else
			System.out.println("올바르지 않은 주민번호입니다.");
	}
}
