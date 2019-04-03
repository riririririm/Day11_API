package com.rim.util.list.ex1;

import java.util.ArrayList;

public class ListExView {
	public void view(ArrayList<Member> info) {
		for(int i=0;i<info.size();i++) {
			System.out.println("[이름]" + info.get(i).getName() 
					+ "[나이]" + info.get(i).getAge());
		}
	}

}
