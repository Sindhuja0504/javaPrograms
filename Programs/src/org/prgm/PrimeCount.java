package org.prgm;

public class PrimeCount {
	public static void main(String[] args) {
		//prime number count from 1 to 500
				int count=0;
				
				for(int i=1;i<=500;i++) {
					if(i%2==0) {
						//System.out.println(i);
						
						count=count+1;
						
					}
					
				}
				System.out.println(count);

			}


}
