package org.bufffer;

public class UpperToLower {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("WelcomE");
		StringBuffer sb1 = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		//String sb = "WelcomE";
		System.out.println("length: "+sb.length());
		//sb.ensureCapacity(60);
	
		for(int i=0;i<sb.length(); i++) {
			
		char c=sb.charAt(i);
			if(Character.isUpperCase(c)) {
//				System.out.println();
				sb1.append(Character.toLowerCase(c));
					sb2.append(Character.toLowerCase(c));

			}
			else {
//				System.out.println();
				sb1.append(Character.toUpperCase(c));
				sb2.append(Character.toUpperCase(c));
			}
			
//		String s=	sb1.append(c);		
		}
		System.out.println("StringBuffer: "  +sb1);
		System.out.println("StringBuilder: "+sb2);
       
	}

}
