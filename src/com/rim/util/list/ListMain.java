package com.rim.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(4); // int > Integer autoBoxing
		arr.add(2.5); //double > Double
		arr.add("6"); 
		arr.add('v');
		
		arr.add(1,2000);
		
//		for(int i=0;i<arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
		System.out.println(arr);
		
		arr.remove(1);
		System.out.println(arr);
		
		arr.remove("6");
		System.out.println(arr);
		
		arr.set(0, 100);
		System.out.println(arr);
		

	}

}
