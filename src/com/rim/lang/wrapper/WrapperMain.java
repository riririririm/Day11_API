package com.rim.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		Wrapper_ex1 w = new Wrapper_ex1();
		Wrapper_ex2 w2 = new Wrapper_ex2();
		Wrapper_ex3 w3 = new Wrapper_ex3();
		Wrapper_ex4 w4 = new Wrapper_ex4();
		
		//w.ex1();
		//w.ex2();
		//w2.ex1();
		//w3.ex1();

		Integer n1 = new Integer(10);
		int num = n1; //autoUnBoxing
		n1 = 20; //autoBoxing
		//같은 타입끼리만 가능
		
		//w4.ex1();
	}

}
