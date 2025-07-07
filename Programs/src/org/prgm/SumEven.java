package org.prgm;

public class SumEven {

	public static void main(String[] args) {
		int a=0;
		int b =0;
		
		for(int i=1;i<=100; i++) {
			
			if(i%2==0) {
				a=i+a;
				
			}
			else if(i%2!=0) {
				b=i+b;
				
				
			}
			
		}
		System.out.println("sum of even count:" + a);
		System.out.println("sum of odd count:" + b);

	}

}
