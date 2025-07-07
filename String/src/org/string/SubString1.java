package org.string;

public class SubString1 {
	
	public static void main(String[] args) {
		String str = "I like Java Technology";
		String[ ] s;
		s = str.split(" ");
		System.out.println(s);
		int length = str.length();
		for(int i = 0; i < length; i++) {
		System.out.println(s[i]);

//	String s = new String("Welcome to java class");
//	System.out.println(s.split(" "));
	 }
	}
}
