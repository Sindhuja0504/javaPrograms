package org.practice;

public class ParametersEx {
	
	void add(int a, int b) {
		System.out.println(a+b + ":add");
	}
	void sub(int a, int b) {
		//System.out.println("sub: " + a-b);
		System.out.println( + a-b);
	}
	void div(int a, int b) {
		System.out.println("div: "+ a%b);
	}

	public static void main(String[] args) {
		ParametersEx maths = new ParametersEx();
		maths.add(25, 25);
		maths.multi(10, 5);
		maths.div(10, 2);
		maths.sub(100, 25);

	}
	void multi(int a, int b) {
		System.out.println("multi: "+ a*b);
	}

}
