package org.ex;

public class StackTrace {

	public static void main(String[] args) {
//		try {
//		String s= null;
//		System.out.println(s.length());
//		}
//		catch(NullPointerException point) {
//			//point.printStackTrace();
//			System.out.println(point);
//		}
//		
//		try {
//		    int[] numbers = {1, 2, 3};
//		    System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
//		} catch (ArrayIndexOutOfBoundsException e) {
//		    for (StackTraceElement element : e.getStackTrace()) {
//		        System.out.println(element);  // Prints the stack trace element details (file, method, line number)
//		    }
		try {
			int  a=2/0;
			System.out.println(a);

		}
		catch (Exception e) {
			e.toString();
			System.out.println(e);
			// TODO: handle exception
		}


	
	}
}
