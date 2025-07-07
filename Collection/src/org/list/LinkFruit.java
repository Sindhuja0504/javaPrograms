package org.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkFruit {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList();
		ll.add("Apple");
		ll.add("Banana");
		ll.add("Cherry");
		ll.add("Orange");
		ll.add("Grapes");
		System.out.println(ll);
//		for (String fruit : ll) {
//			System.out.println(fruit);
//			
//		}
		Iterator<String> it = ll.listIterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		
		}

	}

}
