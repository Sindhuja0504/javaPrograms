package org;

import java.util.Scanner;

public class Testing1 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
		int num1 = scan.nextInt();
		System.out.println("num1 : " + num1);
		int num2 = scan.nextInt();
		System.out.println("num2 : " + num2);
		
		if (num1==num2) {
			System.out.println("yes both the number are equal");
			
		} else {
			System.out.println("both the number are not equal");

		}	

	}

}
