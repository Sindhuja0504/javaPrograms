package org.ex;

public class Excep {

	public static void main(String[] args) {
		try
		{
		int a=5,b=0,c;
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
		System.out.println("wrong value");
		}
		finally
		{
		System.out.println("Exception");
		}
//		Excep ref=new Excep();
//		ref.dis();

	}

}
