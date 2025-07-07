package org.pack;

import java.util.Scanner;

public class ConstrEx1 {
	int n1;
	public void local(int n1) {
		n1= n1+1;
		System.out.println(n1);
	}
	ConstrEx1(String a){
		this(34);
		System.out.println(a);
	}
	ConstrEx1(){
		System.out.println("default");
	}
	ConstrEx1(int b){
		System.out.println("b:"+ b);
	}
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the int value");
		int n1= scn.nextInt();
		//ConstrEx1 ex1 = new ConstrEx1();
		ConstrEx1 ex2 = new ConstrEx1(n1);
		//ex1.local(n1);
		
		
		
	}

}
