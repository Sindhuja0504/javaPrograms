package org.Whileloop;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner ex = new Scanner(System.in);
	System.out.println("enter the number:");
//		
		int scan = ex.nextInt();
		//int scan =10;
		do {
			System.out.println("helo");
			scan = scan +1;
			
		}
		while(scan <15);
		
	}

}
