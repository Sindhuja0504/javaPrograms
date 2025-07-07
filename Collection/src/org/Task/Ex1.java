package org.Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex1 {

	public static void main(String[] args) {
//		List to Set:
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("cherry");
		System.out.println(list);
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		
		
		Set<String> set1 = new HashSet<>();
		set1.add("apple");
		set1.add("banana");
		set1.add("cherry");
		List<String> list1 = new ArrayList<>(set1);
		System.out.println(set1);
		
		
  
	}

}
