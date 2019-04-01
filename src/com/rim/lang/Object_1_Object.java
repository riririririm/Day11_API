package com.rim.lang;

public class Object_1_Object {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		
		String ss = "  hello-world";
		String r = ss.substring(3,7);
		System.out.println(r);
		
		System.out.println(ss.toUpperCase());
		
		r=ss.trim();
		
		System.out.println(r);
		
		String[] names = ss.split("-");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
	}

}
