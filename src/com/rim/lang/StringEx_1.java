package com.rim.lang;

import java.util.Scanner;

public class StringEx_1 {

	Scanner sc = new Scanner(System.in);

	public void checkInfo() {
		System.out.println("주민번호 입력");
		String info = sc.next();
		char num = info.charAt(7);

		if (num == '2' || num == '4')
			System.out.println("여자");
		else if (num == '1' || num == '3')
			System.out.println("남자");
	}

	public void ex2() {
		String name = "Mississippi";

		int count = 0;
		int i = -1;
		int num = 0;

		while (true) {
			i = name.indexOf("i",i+1);
			if(i!=-1) {
				count++;
			}else
				break;

		}

		System.out.println("i의 개수:" + count);
	}

	
	public void ex3() {
		System.out.println("문자열 입력:");
		String str = sc.next();
		int result=str.length();
		
		if(str.isEmpty()) {
			System.out.println("0원");
		}else {
			System.out.println(str.length());
			System.out.println(100*result);
		}
	}
	
	public void ex4() {
		System.out.println("id:");
		String id = sc.next();
		
		if(id.length()<=10 && id.indexOf('@')!=-1) {
			System.out.println(id);
		}else if(id.length()>10){
			System.out.println("10글자 이하로");
		}else if(id.indexOf('@')==-1) {
			System.out.println("@이메일 형식으로 입력하세요");
		}
		
	}
	
	public void ex5() {
		System.out.println("업로드할 파일명:");
		String file = sc.next();
		int num = file.indexOf('.');
		int i=-1;
		
		while (true) {
			i = file.indexOf(".",i+1);
			if(i!=-1) {
				num=i;
			}else
				break;

		}

		
		String type = file.substring(num+1);
		//int len = file.length();
		//String type = file.substring(len-3, len);
		
		System.out.println(type);
		
		
		if(type.contentEquals("jpg") || type.contentEquals("png") || type.contentEquals("gif")) {
			System.out.println("업로드 가능");
		}else
			System.out.println("jpg, png, gif 파일을 선택하세요");
	}
}
