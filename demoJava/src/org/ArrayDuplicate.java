package org;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int[] score = {23,14,11,75,11};
		
		int length = score.length ;
		
		System.out.println("total size : "+ length);
		
		for(int i=0; i< score.length; i++)
		{
			for(int j=i+1 ; j<score.length; j++) {
				if(score[i]== score[j])
				{
					System.out.println("duplicate value: " + score[j]);

				}
				
			}
				
		}

	}

}
