package com.rim.util.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SortTest_3 {
	
	
	public static void main(String[] args) {
		Member m1 = new Member("c", 20);
		Member m2 = new Member("a", 32);
		Member m3 = new Member("z", 24);
		Member m4 = new Member("d", 24);
		ArrayList<Member> ar = new ArrayList<Member>();
		ar.add(m1);
		ar.add(m2);
		ar.add(m3);
		ar.add(m4);
		
		
		
		
		
		Collections.sort(ar);
		for(int i=0;i<ar.size();i++) {
			System.out.println("ID : "+ar.get(i).getId());
			System.out.println("Age : "+ar.get(i).getAge());
			System.out.println("=========================");
		}
		
		
		
		
	}
	public static void sort(List<Comparable<Object>> ar) {
		int num=ar.get(0).compareTo(ar.get(1));
		
		if(num>0) {
			
		}else if(num<0) {
			
		}else {
			
		}
	}

}
