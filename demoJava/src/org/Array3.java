package org;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		int [] mark = {23,12,6,98,22,77};
		 
		//find the size of the array 
		int length = mark.length ; // array name, length -->assign to local variable ctrl+2 -> L
		System.out.println("size of the array :" + length);
		
		//find the index value
		System.out.println("index value : " + mark[1]);
		
		//find last value
		System.out.println("last value: "+ mark[length -1]);
		
		//sorting
		Arrays.sort(mark);
		//6,12,22,23,77,98
		System.out.println("After sorting :" + mark[2]);
		
		//print all values
		for(int i=0; i< mark.length; i++) {
			
			System.out.println(mark[i]);
		}
		
	
		
		
		
	
		

	}

}
