package org;

public class LearnMethods {
	
	public void browser() {
		System.out.println("chrome");
	}
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	private int  count() {
		return 2;
		
	}
	//default access modifier
	
	int numberOfall(int i ) {
	
		return i;

	}

	public static void main(String[] args) {
		
		LearnMethods obj = new LearnMethods();
		int scan = obj.numberOfall(7); // ctrl + 2, l
		
		System.out.println(scan);
		int num = obj.count();
		System.out.println(num);
		
		
		
		
		
	}

}
