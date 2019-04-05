package com.rim.util.st;

import java.util.StringTokenizer;

public class StTest1 {

	//어떤 기준으로 문자열 자르기 (SrtingTokenizer이용)
	public static void main(String[] args) {
		String str ="a-b-c-d";
		StringTokenizer st = new StringTokenizer(str,"-");
		
		while(st.hasMoreTokens()) {
			String s= st.nextToken();
			System.out.println(s);
		}
		
		str="1*2*3*4";
		st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken("*"));
		}

	}

}
