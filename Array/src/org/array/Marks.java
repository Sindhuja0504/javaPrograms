package org.array;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks[] = new int[5];
		System.out.println("enter the num:");
		for(int i=0; i<=4;i++) {
			
			marks[i]=scn.nextInt();
			
		}
    for(int i=0; i<=4;i++) {
			
			System.out.println(marks[i]);
			
		}
		
	}

}
