package org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colour1 {

	public static void main(String[] args) {
		List<String> l = new ArrayList();
		l.add("Blue");
		l.add("Green");
		l.add("Yellow");
		l.add("White");
		
		ArrayList<String>l1= new ArrayList<String>();
		l1.add("Blue");
		l1.add("Green");
		l1.add("Black");
		l1.add("Yellow");
		l1.add("White");
		l1.set(1,"Grey");
		
		System.out.println(l1);
		for (String all: l1) {
			System.out.println(all);
			
		}
		
	
//		System.out.println(l1);
//		l1.trimToSize();
//		System.out.println("After trim: "+l1);
		
		
//		l1.removeAll(l1);  //empty
//		System.out.println(l1);
//		System.out.println(l);
//		System.out.println(l1.isEmpty());
		
		//System.out.println(l1.contains(l));
//		ArrayList<Boolean> al = new ArrayList(); //replace
//		for(String s :l1) {
//			al.add(l.contains(s));	
//		}
//		System.out.println(al);
//		Collections.swap(l1, 2, 1);//swap
//		for (String s1 : l1) {
//			System.out.println(s1);
//			
//		}
//		ArrayList<String> join = new ArrayList();//join
//		join.addAll(l);
//		join.addAll(l1);
//		System.out.println(join);
//		System.out.println(join.clone());
		
		

	}

}
