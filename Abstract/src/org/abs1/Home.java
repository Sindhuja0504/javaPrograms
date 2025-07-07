package org.abs1;

public abstract class Home {
	int a = 2;
	
	static {
		int a = 1;
		System.out.println(a);
		
	}
	
	 Home() {
		 System.out.println("this is const" + a);
		 
	}
	Home(String b){
		 System.out.println(b); //doubt
		 
	 }
	 
	 public abstract int mobile();
	 public abstract void temper();
	 public abstract void lap();
	 
	 public void digital() {
		 System.out.println("digital method");
	 }
	 


}
