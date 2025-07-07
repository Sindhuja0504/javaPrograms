package org.string;

public class Replace {
	public static void main(String[] args) {
	
//	String s = new String("Welcome");
	StringBuilder s = new StringBuilder("Welcome");
	//char[] c = {'a','e','i','o','u'};
	int v =0;
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u') {
			
			s.setCharAt(i, '@');
			//s.setCharAt(i, 'o');
			
		}
		
	}
	System.out.println(s);
	
	
	}
	}


