package com.rim.util.random;

import java.util.Random;

public class Random_ex1 {

	public void ex1() {
		for (int i = 0; i < 6; i++) {
			int num = new Random().nextInt(45)+1;
			System.out.println(num);
		}
	}
	
	public void ex2() {
		int[] lotto = new int[6];
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = new Random().nextInt(45)+1;
			System.out.println(lotto[i]);
		}
	}
	
	
	
	public void ex3() {
		String[] foods = {"떡볶이","냉면","순대국","육개장","라면","김밥"};
		
		System.out.println(foods[new Random().nextInt(6)]);
	}
	
	public void ex4() {
		String [] num = {"1","2","2","3","3","3","3","3","3","3"};
		String n = num[new Random().nextInt(num.length)];
		if(n.contentEquals("1"))
			System.out.println("1단계");
		else if(n.contentEquals("2"))
			System.out.println("2단계");
		else
			System.out.println("실패");
	}
}
