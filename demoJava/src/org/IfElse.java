package org;

public class IfElse {

	public static void main(String[] args) {
		// if else
		int score = 80;
		if (score<50) {
			System.out.println("you need to improve");
			
		}
		else if(score>=50 && score<=70) {
			System.out.println("good job");
		}
		else if(score>70) {
			System.out.println("excellent performance");
			
		}
	}

}
