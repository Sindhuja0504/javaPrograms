package org.prgm;

public class MaxMin {

	public static void main(String[] args) {
		int [] a= {10, 100, 90, 20, 40};
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[i]>a[j]) {
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
					}
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("max" +a[a.length-1] );
		System.out.println("min" + a[0]);
		System.out.println(a[(a.length-1)/2]);

	}

}
