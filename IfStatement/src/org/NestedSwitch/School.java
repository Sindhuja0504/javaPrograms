package org.NestedSwitch;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		int std;
		String sec;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter std");
		std = scn.nextInt();
		if((std == 5) || (std == 6) ) {
		System.out.println("enter sec");
		sec=scn.next();
		
		switch(std) {
		case 5:
		switch(sec) {
		case "a":
			System.out.println("sec a ");
			break;
			
		  case "b":
			  System.out.println("sec b");
			  break;
		
			default:
				System.out.println("5 school out ");
				break;
		}break;
		case 6:
		switch(sec) {
		case "a":
			System.out.println("sec a 6");
			break;
		  case "b":
			  System.out.println("sec b");
			  break;
		
			default:
				System.out.println(" 6 school out ");
				break;
		}
		break;
		
		}
		
	}else {
		System.out.println("school not found");
	}
		
	}
		
		
	}


