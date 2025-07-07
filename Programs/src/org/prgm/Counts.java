package org.prgm;

import java.util.Collections;

public class Counts {

	public static void main(String[] args) {
		//Print the count of caps,small,digit and sp count:

		String name="Welcome@123456";
		int upper=0,lower=0,special=0,digit=0;
		for(int s=0;s<=name.length()-1;s++) {
			char ch = name.charAt(s);
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			else if(Character.isLowerCase(ch)) {
				lower++;
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else if(!(Character.isAlphabetic(ch)&& !Character.isDigit(ch)))
			{
			special++;
			
		}
		
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println("special: "+special);
		System.out.println("digit: "+digit);

	}

}
