package org.set;

import java.util.HashSet;
import java.util.Set;

public class SameSet {

	public static void main(String[] args) {
		HashSet<Integer> eg = new HashSet();
		eg.add(3);
		eg.add(8);
		eg.add(4);
		eg.add(7);
		System.out.println("all" + eg);
//		System.out.println(eg.contains(4));
//		System.out.println(eg.equals(7));
		
		HashSet<Integer> eg1= new HashSet<Integer>();
		eg1.add(7);
		eg1.add(12);
		eg1.add(8);
		System.out.println(eg1);
		
		//HashSet<Integer> main = new HashSet<Integer>();
		for (Integer integer : eg1) {
			System.out.println(integer);
			System.out.println(eg.contains(integer));
			
			
		}
		eg.retainAll(eg1);
		System.out.println("retain element: " + eg);
		
		
		eg.clear();;
		System.out.println("removed: " + eg);
		
		
		

	}

}
