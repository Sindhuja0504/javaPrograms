package org.returnType;

public class ReturnEx1 {
	 int a = 23;
	int add(int a, int b) {
		
		return b+a;
	}
	int sub(int a, int b) {
		
		return b; 
		
	}

	public static void main(String[] args) {
		ReturnEx1 demo = new ReturnEx1();
		int b =demo.add(12, 12);
		System.out.println(b);
		int d= demo.sub(12, 3);
		System.out.println(d);
		System.out.println("instance variable: " +demo.a);
		details();
		

	}
	static String details() {
		 String name = "yeshi";
		 System.out.println(name);
		return name;
	
		
	}

}
