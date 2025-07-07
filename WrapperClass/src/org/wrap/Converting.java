package org.wrap;

public class Converting {

	public static void main(String[] args) {
		String s = "12";
		
		//string to int
		int num = Integer.parseInt(s);
		System.out.println("string to int value: "+num);
		System.out.println(num*2);
		
		//int to string
		String s1 = Integer.toString(num);
		System.out.println("int to string " +s1);



	}

}
