package org.switchEx;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		Scanner dem = new Scanner(System.in);
		System.out.println("enter the season num");
		int season= dem.nextInt();
		switch(season) {
		case 1:
		case 2:
		case 3:
			System.out.println("winter season");
		
		break;
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("summer season");
			break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("monsoon  season");
			break;
			default:
				System.out.println("invalid season");
				break;
			
		}
	}

}
