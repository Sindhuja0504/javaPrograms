package org;

import java.util.Scanner;

public class NewTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		int age = obj.nextInt();
		System.out.println("my age is : " +age);
		obj.nextLine();
		String name = obj.nextLine();
		System.out.println("My name is : " + name );


	}

}
