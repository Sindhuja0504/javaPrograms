package org.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("Red");
		tree.add("Blue");
		tree.add("Apple");
		tree.add("Blue");
		tree.add("Pink");
		tree.add("Black");
		tree.add("Whilte");
		System.out.println(tree);
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.size());
		
		
		
		//System.out.println(tree.tailSet("Red"));
		
//		Iterator<String> it = tree.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//			
//			
//		}
		
//		Iterator<String> it1 = tree.descendingIterator();
//		while (it1.hasNext()) {
//			System.out.println(it1.next());
//			
//		}
		TreeSet<String> tree1 = new TreeSet<String>(tree);
		tree1.add("mango");
		tree1.add("Blue");
		tree1.add("Apple");
		tree1.add("Blue");
		tree1.add("apple");
		System.out.println(tree1);
		for (String string : tree1) {
			System.out.println(tree.contains(string));
		}
		
		
		Iterator<String> it = tree1.descendingIterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
			
		}
		
		
//		List<String> list = new ArrayList<String>(tree1);
//		Collections.reverse(list);
//		System.out.println(list);
		
//		HashSet<String> h_set = new HashSet<String>();
//		   // use add() method to add values in the hash set
//		          h_set.add("Red");
//		          h_set.add("Green");
//		          h_set.add("Black");
//		          h_set.add("White");
//		          h_set.add("Pink");
//		          h_set.add("Yellow");
//		      System.out.println("Original Hash Set: " + h_set);
//		    
//		    // Create a List from HashSet elements
//		     List<String> list = new ArrayList<String>(h_set);
//		 
//		     // Display ArrayList elements
//		     System.out.println("ArrayList contains: "+ list);
//		
		

	}

}
