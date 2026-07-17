package org.prgm;

public class Reverse {

	public static void main(String[] args) {
		String s = "sindhuja";
		int n=123456789;
		int rev= 0;
		char c ;
//        String reversed = new StringBuilder(s).reverse().toString();
		StringBuilder str = new StringBuilder(n);
	 //rev= str.reverse();
		System.out.println(rev);
		
		

		

		
		int a = 4876;
		int reverse= 0;
		int remainder= 0;
		
		while(a>0) {
		remainder=	a%10;
		//System.out.println(remainder);
		reverse = (reverse*10)+remainder;
		//System.out.println(reverse);
		a=a/10;
		//System.out.println(a);
		}
		System.out.println(reverse);
//		for(int i=s.length()-1;i>=0;i--) {
////			 System.out.println(i);
//			rev+= s.charAt(i);
////			 rev= rev +s.charAt(i);
//			
//		 }
////		System.out.println(rev); 

	}
	}


