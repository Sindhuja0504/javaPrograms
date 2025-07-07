package org.nestedif;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter english mark: ");
		int eng =scan.nextInt();
		System.out.println("Enter tamil mark:");
		int tml =scan.nextInt();
		System.out.println("Enter science mark:");
		int scn =scan.nextInt();
		System.out.println("Enter social mark:");
		int sol =scan.nextInt();
		System.out.println("Enter maths mark:");
		int mth =scan.nextInt();
		float total = eng + tml + scn + sol + mth;
		System.out.println("total mark: " + total);
		
		float percent = total/ 5;
		System.out.println(percent);
		
		if(percent == 100) {
			System.out.println("centum");
			
		}
		else if (percent >= 50){
			System.out.println("pass");
				
		}
		else
			System.out.println("fail");

	}

}
