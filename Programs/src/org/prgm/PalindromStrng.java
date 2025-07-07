package org.prgm;

public class PalindromStrng {
	public static void main(String[] args) {
		String name ="madam";
		String rev="";
		
		int a =0;
		int b = 0;
		
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
			
		}
		System.out.println(rev);
		if(name.equals(rev)) {
			System.out.println("palindrom is string");
		}
		else {
			System.out.println("palindrom is not a string");
		}

	}

}
