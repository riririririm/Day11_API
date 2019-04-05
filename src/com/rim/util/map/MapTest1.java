package com.rim.util.map;

import java.util.HashMap;

public class MapTest1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("n1", 1);
		map.put("n2", 2);
		
		System.out.println(map.get("n1"));
		
		map.put("n1",4);
		System.out.println(map.get("n1"));
		System.out.println(map);
		System.out.println(map.size());
		
		for(int i=0;i<map.size();i++) {
			System.out.println(map.get("n"+(i+1)));
		}

	}

}
