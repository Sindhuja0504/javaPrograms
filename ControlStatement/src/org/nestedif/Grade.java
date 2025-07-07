package org.nestedif;

public class Grade {
	public static void main(String[] args) {
		
		int total = 80;
		if((total == 100) && (total>= 90 )) {
			System.out.println("Grade A");
			
		}else if((total <=90)&&(total >=70)) {
			System.out.println("Grade B");
			
		}else if ((total<=69) && (total >=45)) {
			System.out.println("Grade c");
		}
		else System.out.println("Grade D");
		
		
	}

}
