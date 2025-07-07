package org.prgm;

public class Palindrome {

	public static void main(String[] args) {
		int a = 141;
		int reverse=0;
		int remainder=0;
		
		int n=a;
		
		while(a>0) {
			remainder = a%10;
			reverse= (reverse*10)+remainder;
			a=a/10;
			
			
		}if(reverse==n) {
			System.out.println("is a palindrom");
		}
		else System.out.println("not a a palindrom");
		
		
		
		
		
		
		

		

	}

}
