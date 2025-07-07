package org.keywords;

import java.util.Scanner;

public class OverLoading {

	
	OverLoading(){
		
		System.out.println("default");
	}
	OverLoading(int a){
		System.out.println("value:" + a);
	}
	public static void main(String[] args) {
	
		OverLoading load = new OverLoading();
		 Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		
		OverLoading load1 = new OverLoading(b);
	}
	

}
