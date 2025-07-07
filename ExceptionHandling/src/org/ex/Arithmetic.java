package org.ex;

public class Arithmetic {

	public static void main(String[] args) throws Exception {
		
//		try {
//			int a = 45/0;
//			System.out.println(a);
//			
//		}
//		catch (ArithmeticException arith) {
//			System.out.println(arith.getCause());
//		}
		
		int marks[]= {34,78,5};
		try {
			System.out.println(marks[4]);
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
//		try {
//		    int result = 10 / 0;
//		} catch (ArithmeticException e) {
//		    System.out.println("Error: " + e.getMessage());  // Output: Error: / by zero
//		}
		

	}

}
