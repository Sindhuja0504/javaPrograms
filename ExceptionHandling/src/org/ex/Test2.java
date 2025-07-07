package org.ex;

public class Test2 {
	public static void main(String[] args){
	{
//	try
//	{
//	System.out.printf("1");
//	int data = 5 / 0;
//	}
//	catch(ArithmeticException e)
//	{
//	Throwable obj = new Throwable("Sample");
//	try
//	{
//	throw obj;
//	}
//	catch (Throwable e1)
//	{
//	System.out.printf("8");
//	}
//	}
//	finally
//	{
//	System.out.printf("3");
//	}
//	System.out.printf("4");
//	}
	
	 try {
         // Manually throwing a throwable object
         throw new Throwable("This is a Throwable instance");
     } catch (Throwable t) {
         // Catching any Throwable
         System.out.println(t.getMessage());  // Output: This is a Throwable instance
     }
	}
	}
}

