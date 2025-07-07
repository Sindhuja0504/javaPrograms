package org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colour {

	public static void main(String[] args) {
		List<String> col = new ArrayList();
		
		col.add("Red");
		col.add("Black");
		col.add("Blue");
		col.add("White");
		System.out.println(col);
		col.add(1,"Yellow");
		System.out.println("After insert:" +col);
//		for(String s : col) {
//			System.out.println(s);
//		}
//		String show =col.get(1);
//		System.out.println("element retrive: "+show);
//		col.set(3, "grey");
//		System.out.println(col);
//		col.remove(2);
//		System.out.println("after remove: "+col);
//		System.out.println("search: "+ col.contains("White"));//search
//		System.out.println(col);
//		Collections.sort(col);
//		System.out.println(col);
		List<String>col1 = new ArrayList(col);//copy one array to another
//		col1.addAll(col);
//		System.out.println(col1);
		col1.add("pen");
		col1.add("pencil");
		col1.add("scale");
		Collections.copy(col1, col);//copy
		System.out.println(col1);
//		Collections.shuffle(col1);
//		System.out.println("shuffle: "+col1);
		Collections.reverse(col1);
		System.out.println("reverse: "+col1);
		

	}

}
