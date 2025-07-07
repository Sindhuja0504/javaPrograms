package org.singleInherit;

public class SamePackS1 {
	
	int a= 12 ;
	int b = a+5;
	int c;
	
	public void add() {
		c = a+b;
		System.out.println("add method: "+ c);
	}
	public void number() {
		System.out.println(b);
	}

}
