package org.prgm;

public class Swaping {

	public static void main(String[] args) {
		
		
		int a =10;
		int b = 20;
		int c;
		
		//with 3rd variable
//		c = a;
//		a=b;
//		b=c;
//		System.out.println(a);
//		System.out.println(b);
//		
		//without 3rd variable
		
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		


	}

}
