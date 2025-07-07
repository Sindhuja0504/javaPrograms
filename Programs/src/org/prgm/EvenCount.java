package org.prgm;

public class EvenCount {

	public static void main(String[] args) {
		//EvenCount count = new EvenCount();
		int evencount=0;
		int oddcount=0;
		 for(int i=1; i<=1000;i++) {
			 if(i%2==0) {
				// System.out.println(i);
				 evencount++;
			 } 
			 else if (!(i%2==0)) {
				 oddcount++;
				 
				 
			 }
		 }
		 System.out.println(evencount);
		 System.out.println(oddcount);
		 

	}

	

}
