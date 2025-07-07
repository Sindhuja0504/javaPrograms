package org.switchEx;

import java.util.Scanner;

public class Maths {
	
	public static void main(String[] args) {
		int operations;
		int a , b ;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter int a value");
		a= scan.nextInt();
		System.out.println("enter int b value");
		b= scan.nextInt();
		System.out.println("enter int value");
		operations = scan.nextInt();
		
		
//		switch(operations) {
//		case "add":
//			System.out.println(a+b);
//			break;
//			
//		case "sub":
//		System.out.println(a-b);
//		break;
//		
//		default:
//			System.out.println("add value:" + a+b);
//			System.out.println(a-b);
//			break;
//		
//		
//	}
		if(operations == 1) {
			System.out.println(a+b);
			
		}
		else if(operations == 2) {
			System.out.println(a-b);
		}
		else {
			System.out.println(a+b);
		 System.out.println(a-b);
		}
	}

}
