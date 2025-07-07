package org.prgm;

public class Amstrong1 {

	public static void main(String[] args) {
		//amstrong number from 1 to 600
		int a=0;
		int b=0;
		int c=0;
		
		
		for(int i=1;i<=600;i++) {
		a=i;
		c=0;
		int ams=a;
		while(a>0) {
		b=	a%10;
		c= c+(b*b*b);
		a=a/10;
		}
		if(ams==c) {
			System.out.println(c + "amstrong ");
		}
			
		}
	}

}
