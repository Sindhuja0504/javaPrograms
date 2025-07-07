package org.prgm;

public class Fibino {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			sum= sum+c;
			
			a=b;
			b=c;
			
			//System.out.println();
		}
		System.out.println("sum: " +sum);
		}

}
