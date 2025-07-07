package org.scan;

import java.util.Scanner;

public class Project {
	Scanner s = new Scanner(System.in);
	//String name;
	String name;
	int age;
	 int a, b;
	public void one() {
		System.out.print("name is :  " );
		s.nextLine();
		System.out.print("age is: ");
		s.nextInt();
	}
	public void  add() {
     int c;
	System.out.println("a value: ");
	a = s.nextInt();
	System.out.println("b value: ");
	b =s.nextInt();
	//System.out.println(a+b);
	c= a+b;
	System.out.println(c + " c value");
	}
	public static void main (String args[]) {
		Project demo = new Project();
		demo.one();
		demo.add();
		//System.out.println("main method " + c);
	}

}
