package org.practice;

public class ReturnStringEx {
	
	String getName(String a) {
		//String b = a;
		//System.out.println("string b: " +b);
		//return b;
		return "sindhu";
		
	}
	int getMobilenum(int a) {
		//System.out.println("int a: " +a);
		return 8;
	}

	public static void main(String[] args) {
		ReturnStringEx eg1 = new ReturnStringEx();
		int b =eg1.getMobilenum(1234567);
		String a =eg1.getName("sindhu");
		System.out.println(a);
		System.out.println("main b: " +b);
		int num = eg1.add(45, 10);
		System.out.println(num);
		//System.out.println("main a: " +a);		
	}
	int add(int a, int b) {
		int c = a+b;
		//System.out.println(c);
		return c;
	}

}
