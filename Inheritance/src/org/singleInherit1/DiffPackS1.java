package org.singleInherit1;

import org.singleInherit.DiffPackS2;

public class DiffPackS1 extends DiffPackS2{
	private int count() {
		return 7;
	}
	public void blue() {
		System.out.println("blue method");
	}
	public static void main(String[] args) {
		DiffPackS1 diff = new DiffPackS1();
		int i =diff.count();
		System.out.println(i);
		diff.blue();
		diff.colour();
		String c= diff.colrName();
		System.out.println(c);
	}

}
