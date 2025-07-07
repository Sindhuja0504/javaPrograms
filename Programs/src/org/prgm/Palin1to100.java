package org.prgm;

public class Palin1to100 {

	public static void main(String[] args) {
		int a;
		int b=0;
		int c=0;
		int n;
	for(int i=1;i<=1000;i++) {
		a=i;
		n=a;
		c=0;
		
		while(a>0) {
			b= a%10;
			c = (c*10)+b;
			a=a/10;
			//System.out.println(c);
			
			}
		if(n==c) {
			System.out.println(c+ "is a palindrom");
		}
		
		
	}

	}

}
