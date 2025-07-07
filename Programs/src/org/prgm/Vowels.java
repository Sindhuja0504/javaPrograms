package org.prgm;

public class Vowels {

	public static void main(String[] args) {
		String name = "Madras Security Printes";
		String vowels=  "";
		String constant ="";
		for (int i=0;i<=name.length()-1;i++) {
			
			char ch= name.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u') {
				//System.out.println(ch);
				vowels =vowels + ch;
			}
			else {
				//System.out.println(ch);
				constant =constant+ch;
			}
			//System.out.println();
		}
		System.out.println(vowels);
		System.out.println(constant);
		//System.out.println(constant+vowels);
		
		
		// count
//		int count=0;
//		for(int i=0;i<=name.length()-1;i++) {
//			char ch =name.charAt(i);
//			count++;
//		}
//		System.out.println(count);


	}

}
