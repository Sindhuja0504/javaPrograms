package org.practice;

public class ReturnEx {
	int c;
	int store1(int a, int b) {
		System.out.println(c= a+b);
		return c;
	}

	public static void main(String[] args) {
		
		ReturnEx eg = new ReturnEx();
		int a = eg.store1(19, 20);
		System.out.println("main method: " + a);
		

	}

}
