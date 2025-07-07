package org.practice;

public class CountEven {

	public static void main(String[] args) {
		//sum of evn num
		
		int sum=0;
		for(int i=1;i<=500;i++) {
			if(i%2==0) {
				sum= sum+i;	
			}
		}
		System.out.println(sum);
		
		//count evn num
//		int count=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==0) {
//				count++;	
//			}
//		}
//		System.out.println(count);

	}

}
