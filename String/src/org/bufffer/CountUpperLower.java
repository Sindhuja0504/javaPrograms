package org.bufffer;

public class CountUpperLower {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("WelComeToJava");
		StringBuilder sb1 = new StringBuilder("");
		
		for(int i =0; i<sb.length();i++) {
			char c = sb.charAt(i);
//			if(Character.isUpperCase(c));
//			Character.isup
			
			if(Character.isUpperCase(c)) {
				sb1.append(Character.charCount(c));
				
				
			}
			else {
				Character.isLowerCase(c);
				sb1.append(Character.charCount(c));
				
			}
			System.out.println("uppercase count: "+c);
			System.out.println("lowercase count: " + c);
		}
		
	}

}
