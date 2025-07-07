package org.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex5 {

	public static void main(String[] args) {
		//Map to List of Entries
		Map<String,Integer> map = new HashMap<>();
		map.put("apple", 3);
		map.put("banana", 2);
		map.put("cherry", 5);
		List<Entry<String,Integer>>list = new ArrayList<>(map.entrySet());
		System.out.println(list);
	


	}

}
