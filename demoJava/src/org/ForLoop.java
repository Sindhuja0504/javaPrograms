package org;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
	//1.
		Scanner obj = new Scanner(System.in);
		System.out.println("enter a value");
	    int a= obj.nextInt();
	    System.out.println("enter b value");
	    int b = obj.nextInt();
	int i =a;
	 int	evencount = 0 ;
	 int oddcount =0;
	
	    
	    for(i=a; i<=b; i=i+1) {
	    	if(i%2==0) {
	   
	    evencount= evencount +1;
	    	//System.out.println(i);
	    	
	    	}
	    	else  {
	    		System.out.println(i);
	    		oddcount = oddcount+1;
	    	}
	    }
	    System.out.println("count of even number");
    	System.out.println(evencount);
    	System.out.println("count of odd number");
    	System.out.println(oddcount);
	   	
	//2.
//		int a= 5;
//		int b= 10;
//		for(a=5;a<=b; a=a+1) {
//			System.out.println(a);
//}
	}
}