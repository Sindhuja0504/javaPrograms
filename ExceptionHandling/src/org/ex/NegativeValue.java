package org.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativeValue {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter any number:");
	 int a=scan.nextInt();
	 try {
		 int b =2/0;
		 
		 
	 
//	 if(a<0) {
//		 System.out.println("a value:" + a);
//		 throw new Exception();
//	 }
	 }
//	 finally {
//		 System.out.println("negative value should not be accept");
//	}
//	 else {
//		 System.out.println("postive value");
//	 }
	 catch (ArithmeticException e) {
		System.out.println();
	}
	 
	 catch (Exception e) {
		System.out.println("negative value should not be accept");
	}
	 
	 

	}

}
