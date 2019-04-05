package com.rim.util.sort;

import java.util.Arrays;
import java.util.Random;

public class SortTest_1 {

	public static void main(String[] args) {
		int[] ar = new int[3];
		String[] s = new String[3];
		
		Random r = new Random();
		for(int i=0;i<ar.length;i++) {
			ar[i]=r.nextInt(45)+1;
			System.out.print(ar[i]+"  ");
		}
		
		System.out.println();
		
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+"  ");
		}
			
		s[0]="test"; s[1]="zoo"; s[2]="apple";
		
		System.out.println("------------------");
		Arrays.sort(s);
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+"  ");

	}

}
