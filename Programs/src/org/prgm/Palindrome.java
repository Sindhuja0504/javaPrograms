package org.prgm;

public class Palindrome {

	public static void main(String[] args) {
		String a = "DAD";
		String s ="";
		
		for(int i=a.length()-1;i>=0;i--) {
		s = s+	a.charAt(i);
		}
		if(a.equals(s)) {
			System.out.println("is a palindrom");
		}
		else {
			System.out.println("Not a palindrom");
		}
			
		
		//int a= 411;
//		int rev;
//		 int rem;
//		 int temp;
//		 
//		 for(int i=1;i<=1000;i++) {
//			 int a=i;
//			 rev=0;
//			 rem=0;
//			temp=a;
//			 while(a>0) {
//				 rem=a%10;
//				 rev=(rev*10)+rem;
//				 a=a/10;
//			 }
//			 if(rev==temp) {
//				 System.out.println("palindrom:" + rev);
//				 
//			 }
//			 
//		 }
//		 
		 
//		 while(a>0) {
//			 rem=  a%10;
//			 rev= (rev*10)+rem;
//			 a=a/10;
//		 }
		 
	
		

		
		
//		int a = 141;
//		int reverse=0;
//		int remainder=0;
//		
//		int n=a;
//		
//		while(a>0) {
//			remainder = a%10;
//			reverse= (reverse*10)+remainder;
//			a=a/10;
//			
//			
//		}if(reverse==n) {
//			System.out.println("is a palindrom");
//		}
//		else System.out.println("not a a palindrom");
//		
		
		
		
		
		
		

		

	}

}
