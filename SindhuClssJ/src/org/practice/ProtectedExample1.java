package org.practice;

public class ProtectedExample1 extends ProtectedExample {
	  void multi() {
		  // byte b = 23;
		   short s = 132;
		   System.out.println(s);
	   }
	public static void main(String []args) {
		ProtectedExample1 ex = new ProtectedExample1();
		ex.add();
		//ex.sub();
		ex.multi();                                                                      
		                  
	}
	
	

}
