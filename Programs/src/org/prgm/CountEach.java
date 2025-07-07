package org.prgm;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountEach {
	//Count of each character in given String

	public static void main(String[] args) {
		String name = "Welcome";
		
		
		Map<Character, Integer> emp = new LinkedHashMap<>();
		System.out.println(emp);

		char[] ch = name.toCharArray();
		System.out.println(ch);
		
		for (char c : ch) {
		if (emp.containsKey(c)) {
			
		int count = emp.get(c);
		System.out.println("emp.get(c)"+emp.get(c));
		emp.put(c, count + 1);
		
		
		} else {
		emp.put(c, 1);

		}
		

		}
		System.out.println(emp);


		

	}

}
