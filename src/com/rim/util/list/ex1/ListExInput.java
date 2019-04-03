package com.rim.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {

	private Scanner sc;
	//private ArrayList info;

	public ListExInput() {
		sc = new Scanner(System.in);
		//info = new ArrayList();
	}

	public void setInfo(ArrayList info) {
		//Member m = new Member();
		
		System.out.println("이름입력:");
		String name = sc.next();
		info.add(name);
		
		System.out.println("나이입력:");
		int age = sc.nextInt();
		info.add(age);
		
	}
}
