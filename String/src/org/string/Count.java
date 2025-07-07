    package org.string;

public class Count {

	public static void main(String[] args) {

		String s = "Welcome To Java class @123 ";
		int upper = 0;
		int lower = 0;
		int num = 0;
		int spl   = 0;
		int white = 0;
		
		for(int i = 0; i<s.length();i++) {
			
			char c = s.charAt(i);
			//System.out.println(c);
			//count++;
			if(Character.isUpperCase(c)) {
			upper++;
			
			}
			else if(Character.isLowerCase(c)) {
				lower++;		
			}
			else if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
				spl++;
			}
			
			else if (Character.isDigit(c)){
				num++;
			}
			else if(Character.isWhitespace(c))
				white++;	
		}	
		System.out.println("uppper:"+upper);
		System.out.println("lower:"+lower);
		System.out.println("spl:"+spl);
		System.out.println("num:"+num);
		System.out.println("white:"+white);
		//System.out.println(s.);

	}

}
