package org.string;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter v1: ");
		String v1 = scn.next();
		System.out.println("enter v2: ");
		String v2 = scn.next();
		System.out.println(v1.compareToIgnoreCase(v2));
		System.out.println(v1.compareTo(v2));
		
		
		System.out.println("enter v3: ");
		String v3 = scn.next();
		System.out.println("enter v4: ");
		String v4 = scn.next();
		System.out.println(v3.compareToIgnoreCase(v4));
		System.out.println(v3.compareTo(v4));
	}

}
