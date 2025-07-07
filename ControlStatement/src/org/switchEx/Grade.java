package org.switchEx;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Grade {
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
		float percent = total/5f;
		System.out.println("percentage: " + percent);
		
		int intValue = (int) percent;
		int gradeCategory = (int) percent / 10;
		
		
		switch(gradeCategory){
			case 9:
			System.out.println("grade A");
			break;
			
			case 8: System.out.println("grade B");
			break;
			
			case 7: System.out.println("grade c");
			break;
			case 6: System.out.println("grade d");
		}
		
		 
		
	}

}
