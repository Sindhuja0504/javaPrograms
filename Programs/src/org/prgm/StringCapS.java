package org.prgm;

public class StringCapS {

	public static void main(String[] args) {
		String name = "Welcome to java sql java to java sql plsql";
		String  empty= "";
		
		String [] str= name.split(" ");
		for(String s : str) {
			//System.out.println(s);
		String cap=	s.substring(0,1).toUpperCase();
		String cap2= s.substring(1);
		System.out.print(cap+cap2+ " ");
		//String first=cap.toUpperCase();
		//System.out.println(name);
			
		}


	}

}
