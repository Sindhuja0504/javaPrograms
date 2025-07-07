package org.scan;

import java.util.Scanner;

public class Person1 {
	static  String name;
	static int age;
	void a(){
	
	Scanner s = new Scanner(System.in);
	s.nextLine();
	s.nextInt();
	
	}
	public static void main(String[] args) {
		Person1 demo = new Person1();
		demo.a();
		//System.out.println();
		System.out.println("my name " + demo.toString());	

	}

}


