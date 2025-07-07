package org.prgm;

public class ConverUppToLow {

	public static void main(String[] args) {
		//Convert all Small case into caps and reverse
		String name = "WelcomE";
		System.out.println(name);
		
		
		StringBuilder sb = new StringBuilder(name);
		for(int i =0;i<=name.length()-1;i++) {
			
		char ch=name.charAt(i);
		if(Character.isLowerCase(ch)) {
			sb.setCharAt(i, Character.toUpperCase(ch));
			
		}
		
		}
		System.out.println(sb);
		System.out.println(sb.reverse());
	
	}

}
