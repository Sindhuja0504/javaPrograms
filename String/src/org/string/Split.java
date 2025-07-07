package org.string;
public class Split {

	public static void main(String[] args) {
		String s ="Welcome to java class";
	
		String[] str = s.split(" ");
		for(int i =0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		System.out.println("********************");
		String[] str1 = s.split("l");
		for(int i =0;i<str1.length;i++) {
		System.out.println(str1[i]);
	}
		System.out.println("*******Substring********");
		System.out.println(s.substring(0, 7));
		
		
	}
	
}
