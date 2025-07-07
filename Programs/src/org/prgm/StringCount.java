package org.prgm;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		//Count of the word in a given String:

		String name = "Welcome to java sql java to java sql plsql";
		Map<String,Integer> emp = new LinkedHashMap();
		String[] s =name.split(" ");
		for(String str: s) {
			if(emp.containsKey(str)) {
				int count= emp.get(str);
				emp.put(str, count+1);
			}
			else {
				emp.put(str, 1);
			}
			
			
		}
			
		
		System.out.println(emp);
		
		

	}

}
