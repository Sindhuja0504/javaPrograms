package org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayL {

	public static void main(String[] args) {
		
		ArrayList al =new ArrayList<String>();
		al.add("Red");
		al.add("blue");
		al.add("blue");
		al.add("pink");
		al.add("black");
		al.add("whilte");
		
		ArrayList al1 =new ArrayList<String>();
		al1.add("grapes");
		al1.add("apple");
		al1.add("mango");
		al1.add("banana");
		al1.add("banana");
		al1.add("banana");
		System.out.println(al1);

		System.out.println(al);
		al.add(0, "wine");
		System.out.println("retrive: " + al.get(4));//retrive value
		al.set(1, "grey");
		al.remove(2);
		System.out.println(al.contains("blue"));//search
		System.out.println(al);
		
		Collections.shuffle(al);// shuffle
		
//		Collections.copy(al, al1);// copy
//		
		System.out.println(al);
//		System.out.println(al1);
		//System.out.println(al.clone());
//	Collections.sort(al); // arrange value
//	System.out.println(al);
//		Set  set= new HashSet<String>();
//		set.addAll(al);
//		//System.out.println(set);
//		for (Object object : set) {
//			System.out.println(object);
//			
//			
//		}
		
}

	}


