package org.pattern;

public class DoWhile {
	public static void main(String[] args) {
		int star = 1;
		
		do {
			int i=0;
			do {
				System.out.print("*");
				i++;
				
			}while(i!=star);
			System.out.println();
		
			star++;
			
		}while(star<=5);
	}

}


