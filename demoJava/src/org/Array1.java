package org;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		int i =0;
		int[] mark = new int[5];
	
		for(i=0; i<=4; i=i+1) {
			
			mark[i]	=obj.nextInt();
			System.out.println("value of i = :" + i);
		}
		for(i=0; i<=4; i=i+1) {
		System.out.println(mark[i]);
		
		
//		mark[0]	=obj.nextInt();
//		mark[1]	=obj.nextInt();
//		mark[2]	=obj.nextInt();
//		mark[3]	=obj.nextInt();
//		mark[4]	=obj.nextInt();
		
//		System.out.println(mark[0]+mark[1]+mark[2]+mark[3]+mark[4]);
//		System.out.println(mark[3]);

	}

}
}
