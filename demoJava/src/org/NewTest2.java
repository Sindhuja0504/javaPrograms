package org;

import java.util.Scanner;

public class NewTest2 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		String name = obj.next();
		float score = obj.nextFloat();
		//obj.nextLine();
		String dept = obj.nextLine();
		System.out.println("my name is : " + name);
		System.out.println("my score is : " + score /10 + "/10");
		System.out.println("my dept is: " + dept);
		
		
		
		
//		int a= obj.nextInt();
//		int b = obj.nextInt();
//		int c = obj.nextInt();
//		int d = a*b*c;
//		int e = a+b+c;
//		System.out.println("multiple ans :" + d);
//		System.out.println("add ans :" + e);
//		 int s =d/e;
//		 System.out.println("divide ans :" + s);
//		
		

	}

}
