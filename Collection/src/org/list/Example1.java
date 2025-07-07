package org.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
	 // Create a List of integers
    List<Integer> numbers = new ArrayList<>();
    numbers.add(15);
    numbers.add(3);
    numbers.add(9);
    numbers.add(21);
    numbers.add(7);
    List <Integer>num = new ArrayList<>();
    num.add(8);
    num.addAll(numbers);
    Collections.sort(num);
    System.out.println(num);
   
    List <String>l = new ArrayList();
	l.add("orange");
	l.add("melon");
	l.add("apple");
	l.add("mango");
	System.out.println(l);
	System.out.println(l.indexOf("apple"));
    
     
	}

}
