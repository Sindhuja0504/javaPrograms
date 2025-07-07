package org.if1;

import java.util.Scanner;

public class BuzzNum {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num =scn.nextInt();
		System.out.println("num:" + num);
		
		if((num % 10 == 7) || (num ==7)) {
			System.out.println("its a buzz number");
		}
		else System.out.println("its not a buzz number");
	}

}
