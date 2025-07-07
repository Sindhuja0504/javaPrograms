package org.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hash {

	public static void main(String[] args) {
		HashSet hs = new HashSet<String>();
		hs.add("mango");
		hs.add("apple");
		hs.add("apple");
		hs.add("apple");
		hs.add("grape");
		hs.add("banana");
		hs.add("pine apple");
		hs.add("gova");
		
		System.out.println(hs);
	
		//System.out.println(hs.clone());
//		Iterator<String> it =  hs.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println("total elements: " + hs.size());
//		hs.removeAll(hs);
//		System.out.println("after cleared: "+ hs);
		System.out.println(hs.isEmpty());
		//Object[] array = hs.toArray();
		
		Set<String> tree = new TreeSet<String>(hs);
		System.out.println(tree);
		for (String string : tree) {
			System.out.println(string);
			
		}
		
		
//		if (hs.isEmpty()) {
//			System.out.println("hashset is empty");
//			
//		}
//		else {
//			System.out.println("hasset is not empty");
//		}
		

	}

}
