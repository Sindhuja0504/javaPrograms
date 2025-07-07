package org.prgm;

public class Amstrong {

	public static void main(String[] args) {
		int a = 371;
		int b =0;
		int c=0;
		
		int temp = a;
		
		
		while(a>0) {
			b= a%10;
			c= c+(b*b*b);
			a=a/10;
		}
		if(c==temp) {
			System.out.println("it is amstrong num");
			
		}
		
	else {
		System.out.println("not a amstrong num");
		}
		System.out.println(c);
	}

}
