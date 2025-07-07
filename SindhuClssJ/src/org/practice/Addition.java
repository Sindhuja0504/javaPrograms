package org.practice;

public class Addition {
	 static int a = 10;
	 int b= 20, c;
	void sum() {
		c= a+b;
		System.out.println("add: " + c);
	}
	
	public static void main(String[] args) {
		Addition add = new Addition();
		add.sum();
		System.out.println("main method " + add.sum1());
		//add.sum1();
		add.sum();	
	}
	int sum1() {
		c = a-b;
		System.out.println("sub: " + c);
		return c;
	}

}
