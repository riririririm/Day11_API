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

	public void setInfo(ArrayList info) {
		System.out.println("이름입력:");
		info.add(sc.next());
		System.out.println("나이입력:");
		info.add(sc.nextInt());
		
		//return info;
	}
}
