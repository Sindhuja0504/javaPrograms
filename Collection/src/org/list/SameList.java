package org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SameList {

	public static void main(String[] args) {
		List l = new ArrayList();
				l.add("Blue");
				l.add("Green");
				l.add("Yellow");
				l.add("Black");
				l.add("Black");
				System.out.println(l);
			    l.remove(2);
			    l.set(1, "Red");
			   System.out.println(l);
			   System.out.println(l.contains("Red"));
//			   Collections.sort(l);
//			   System.out.println(l); 
			   System.out.println(l.indexOf("Green"));
			   l.lastIndexOf("Black");
		
			 
			   
			   
	
		
		
		

		

	}

}
