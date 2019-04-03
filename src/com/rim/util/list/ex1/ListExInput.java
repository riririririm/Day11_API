package com.rim.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExInput {

	private Scanner sc;
	private ArrayList info;

	public ListExInput() {
		sc = new Scanner(System.in);
		info = new ArrayList();
	}

	public void setInfo(ArrayList<Member> info) {
		Member m = new Member();
		
		System.out.println("이름입력:");
		String name = sc.next();
		m.setName(name);
		
		System.out.println("나이입력:");
		int age = sc.nextInt();
		m.setAge(age);
		
		info.add(m);
		
		//return info;
	}
}
