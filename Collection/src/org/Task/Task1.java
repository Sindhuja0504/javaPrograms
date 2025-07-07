package org.Task;

import java.util.HashSet;

public class Task1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("ID03");
		set.add("ID01");
		set.add("ID02");
		set.add("ID01");
		
		//System.out.println(set.contains("ID02"));
		if(set.contains("ID02")) {
			System.out.println("Already visited");
		}
		else {
			System.out.println("Not visited");
		}
	Object a[]= set.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}

//		 int index = 0; 

//		
//		
//		
//		while (index<a.length) {
//			System.out.println(a[index]);
//			index++;
//			
//		}
		
		//int add;

		//System.out.println(a[set]);
				
	}
	}


