package org.string;

public class SubString {

	public static void main(String[] args) {
		
		String s = "Welcome";
		int vowels = 0;
		int cons = 0;
		//a,e,i,o,u
		for(int i = 0; i<s.length();i++) {
		if(s.charAt(i) == 'a' || s.charAt(i) == 'e'||s.charAt(i) == 'i' 
				|| s.charAt(i) == 'o' || s.charAt(i) == 'u') {
			
			vowels++;
			//System.out.println(vowels);
				
			}else {
				cons++;
			//	System.out.println(cons);
				
			}
//		System.out.println("vowels count: " +vowels);
//		System.out.println("consonant count :" + cons);
		
		}
		System.out.println("vowels count: " +vowels);
		System.out.println("consonant count :" + cons);
	}

}
 