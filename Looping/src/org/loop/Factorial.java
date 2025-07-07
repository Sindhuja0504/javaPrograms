package org.loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number:");
		int fac = scn.nextInt();
		//int fac = 5;
		int num = 1;
		
		for(int i= 1; i<=fac; i++) {
			num *= i;
		
		}
		System.out.println("factorial of "+ fac +" is:" + num);
	}

}
