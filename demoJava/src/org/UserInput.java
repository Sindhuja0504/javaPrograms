package org;

import java.util.Scanner;

public class UserInput {


	public  static void main(String[] args) {
		 //int a;
		System.out.println("running");
		
		Scanner Obj = new Scanner(System.in);
		 
		 int a  = Obj.nextInt();
		 
		 //System.out.println(a);
		System.out.println("this is int " + a);
		String b = Obj.next();
		System.out.println("this is string " + b);
		 
		

	}

}
