package org.array;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the num:");
		int[] num = new int[5];
		 num[0] =scn.nextInt();
		 num[1] =scn.nextInt();
		 num[2] =scn.nextInt();
		 num[3] =scn.nextInt();
		 num[4] =scn.nextInt();
		 System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);
	}

}
