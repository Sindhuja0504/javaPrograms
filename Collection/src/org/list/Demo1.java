package org.list;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		LinkedList <String>ll= new LinkedList();
		ll.add("Kannan");
		ll.add(null);
		ll.add("3");
		System.out.println(ll);
		ll.offer("sindhu");
		ll.offerFirst("sindhu");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println("removefrst" +ll);
		ll.clone();
		System.out.println("clone" +ll);
		System.out.println(ll.element());//first element return
		System.out.println(ll.hashCode());
		System.out.println(ll.offerLast("14"));
		ll.addLast("helo");
		ll.offerFirst("hi");
		System.out.println(ll);
		
		
		
		

	}

}
