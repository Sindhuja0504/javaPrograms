package org.scan;

import java.util.Scanner;

public class Sample2 {
	int num1, num2;
	Scanner s2 = new Scanner(System.in);
     void number() {
    	num1= s2.nextInt();
    	num2= s2.nextInt();
//    	System.out.println("first num is "+ num1 +" and Second num is "+num2);
    	if(num1>num2) {
    		System.out.println("number 1: " +num1 +  " is big");
    	}else if(num1<num2) {
    		System.out.println("number 2 :" + num2 + " is big");
    	}else {
    		System.out.println("Both are equal");
    	}       
    	
     }
	public static void main(String[] args) {
		
		Sample2 sp2 = new Sample2();
		
		while(true) {
			sp2.number();
		}

	}

}
