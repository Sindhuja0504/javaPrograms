package org.multilevel;

public class Four extends Three{
	void num4() {
		System.out.println("this is class 4 and 3");
	}
	
	public static void main(String[] args) {
		Four no = new Four();
		no.num3();
		no.num1();
		no.num4();
		
	}

}
