package org.map;

import java.util.HashMap;
import java.util.Set;

public class HashM {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(51, "kannan");
		map.put(null, null);
		map.put(4, "sindhu");
		map.put(3, "robin");
		map.put(53, "gowtham");
		map.put(2, "robin");
		// map.put(null, null);
		System.out.println(map);
		System.out.println(map.size());

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(7, "sriram");
		map1.putAll(map);
		System.out.println(map1);
		// System.out.println(map1.clone());
		// System.out.println(map1.isEmpty());
		if (map1.containsKey(4)) { // testing the key is present
			System.out.println("yes contain");

		} else {
			System.out.println("not contain");
		}
		if (map1.containsValue("sriram")) {
			System.out.println("yes contain");
		} else {
			System.out.println("not contain");// testing the value is present
		}
		Set set = map1.entrySet();
		System.out.println("entry set: " + set);
		System.out.println(map1.get(51));// getting value by giving keys
		System.out.println("all keys: " + map1.keySet());
        System.out.println(map1.values());
	}

}
