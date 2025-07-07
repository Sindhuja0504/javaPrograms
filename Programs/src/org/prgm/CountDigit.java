package org.prgm;

public class CountDigit {

	public static void main(String[] args) {
		int a = 12567893;
		int count=0;
		while(a>0) {
			a=a/10;
			count=count++;
		}
		//System.out.println(count);
		for(int i=0;i<8;i++) {
			
			count++;
			
		}
		System.out.println(count);
		
		

	}

}
