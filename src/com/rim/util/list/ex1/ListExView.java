package com.rim.util.list.ex1;

import java.util.ArrayList;

public class ListExView {
	public void view(ArrayList info) {
		for(int i=0;i<info.size();i+=2) {
			System.out.println("[이름]" + info.get(i) + "[나이]" + info.get(i + 1));
		}
	}

}
