package com.rim.util.list;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListTest_1 {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 숫자입력받아서 해당 숫자만큼 랜덤한 숫자 생성 및 리스트에 추가, 출력
		System.out.println("숫자입력");
		int num = sc.nextInt();

		ArrayList ar = new ArrayList();
		Random r = new Random();

		for (int i = 0; i < num; i++)
			ar.add(r.nextInt(10)+1);
		
		System.out.println(ar);
	}
	
	public static void main(String[] args) {
		ListTest_1 t1 = new ListTest_1();
		t1.ex1();
	}
}
