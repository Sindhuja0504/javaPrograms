package org.nestedif;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner ppl = new Scanner(System.in);
		System.out.println("Enter the age");
		int age =ppl.nextInt();
		if (age<=13) {
			System.out.println("Child");
		}
		else if (age<=25) {
			System.out.println("adult");
		}
		else System.out.println("senior");
			
		

	}

}
