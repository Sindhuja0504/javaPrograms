package org.switchEx;

import java.util.Scanner;

public class Days {
	 static String day ;
	public static void main(String[] args) {
		
		Scanner demo = new Scanner(System.in);
		System.out.println("enter sec num:");
		int sec = demo.nextInt();
		
		switch(sec) {
		
		case 1:System.out.println("monday");
			//day = "monday";
		break;
		case 2 : System.out.println("Tuesday");
			//day = "tuesday";
		break;
		case 3:System.out.println("Wednesday");
			// day = "Wednesday";
			 break;
		case 4:System.out.println("Thursday");
		// day = "Wednesday";
		 break;
		case 5:System.out.println("Friday");
		// day = "Wednesday";
		 break;
		case 6:System.out.println("Saturday");
		// day = "Wednesday";
		 break;
		case 7:System.out.println("sunday");
		// day = "Wednesday";
		 break;
			
		
		default:
			System.out.println("invalid input");
			break;
		
		}
		//System.out.println("today is:" + day);
		
	}

}
