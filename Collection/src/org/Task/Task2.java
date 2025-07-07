package org.Task;

import java.util.Collections;
import java.util.LinkedList;

public class Task2 {

	public static void main(String[] args) {
		 LinkedList list = new LinkedList();
		 list.add("roja");
		 list.add("raja");
		 list.add("sindhu");
		 list.add("janani");
		 list.add("sindhu");
		 System.out.println(list);
		// list.remove();
		 list.remove("raja");
		 System.out.println(list);
		 Collections.reverse(list);
		 //Collections.reverseOrder();
		 System.out.println(list);
		 for(int i=0;i<list.size();i++) {
			 
			 System.out.println(list.get(i));
		 }
		 System.out.println(list.get(1));
		 
		 
		 

	}

}
