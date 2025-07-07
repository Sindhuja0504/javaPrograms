package org;

import java.util.Scanner;

public class Testing2 {

	public static void main(String[] args) {
		//1. nested if
		Scanner obj = new Scanner(System.in);
		System.out.println("enter salary:");
		int salary = obj.nextInt();
		System.out.println("enter age:");
		int age = obj.nextInt();
		
		if(salary>= 20000 || age<=25) {
			
			System.out.println("loan avaliable");
			System.out.println("enter loan you required");
			int loan = obj.nextInt();
			if(loan <= 50000) {
				System.out.println("eligible for loan");
				
			}
		}else  {
			System.out.println(" not eligible for loan");
			
		}
		
	//   2.if else
		
//		int eng = 67,tam =56, sci =78, soc = 87, math=98;
//		int score = eng+tam+sci+soc+math;
//		
//		int total = score/5;
//		
//		System.out.println("the total marks are : " +score);
//		System.out.println("the total marks are : " +total);
//		if(total< 35) {
//			System.out.println("you need additional class");
//		}else {
//			System.out.println("you are going good");
//		}
		
//				3.string comparison
//		String color1 = "green";
//		
//		if(color1.equals("red")){
//			System.out.println("stop");
//			
//		}
//				if(color1.equals("yellow")){
//			System.out.println("get ready");
//			
//		}else if(color1.equals("green"))
//		{
//			System.out.println("go");
//
//		}

	}

}
