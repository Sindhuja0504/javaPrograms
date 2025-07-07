package org.set;

import java.util.TreeSet;

public class IntegerTree {

	public static void main(String[] args) {
		TreeSet<Integer> num = new TreeSet<Integer>();
		num.add(5);
		num.add(12);
		num.add(7);
		num.add(2);
		num.add(5);
		System.out.println(num);
		System.out.println("greatest number: " + num.ceiling(11));//find greatest number
		System.out.println("lowest number: " + num.floor(3));
		System.out.println(num.higher(7));
		System.out.println(num.pollFirst());
		System.out.println(num);
		System.out.println(num.pollLast());
		System.out.println(num);

	}

}
