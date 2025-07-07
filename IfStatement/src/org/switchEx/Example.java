package org.switchEx;

import java.util.Scanner;

public class Example {
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
		//float total = eng + tml + scn + sol + mth;
		int total = eng + tml + scn + sol + mth;
		System.out.println("total:" + total);
		int percent = total/5;
		System.out.println("percentage: " + percent);
		
		switch(percent){
			case 90:
			System.out.println("grade A");
			break;
			
			case 80: System.out.println("grade B");
			break;
			
			case 70: System.out.println("grade c");
			break;
			case 60: System.out.println("grade d");
		} 
	}
	
}  



