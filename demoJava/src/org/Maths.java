package org;

public class Maths {
	
	
	void sum(int a,int b) {
		System.out.println( a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
	}
	void sub(int b, int c)
	{
		System.out.println( b-c);
	}
	void div (int b, int c)
	{
		System.out.println(b/c);
	}
	void multi (int b, int c)
	{
		System.out.println(b*c);
	}

	
	public static void main(String[] args) {
		
		Maths num = new Maths();
		num.sum(10,10);
		num.sub(10, 15);
		num.div(12, 6);
		num.multi(5,5);
		

	}

}
