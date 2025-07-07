package org.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeM {

	public static void main(String[] args) {
		String str = "swiss";
		//TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	char[] convert=	str.toCharArray();
	for (char c : str.toCharArray()) {
//		System.out.println(c);
		map.put(c, map.getOrDefault(c, 0)+1);
		
	}
	System.out.println(map);
	for (char c : convert) {
		if (map.get(c) == 1) {
			System.out.println(c);
			break;
			
		}
		
	}
	
		

	}

}
