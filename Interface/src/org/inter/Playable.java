package org.inter;

public interface Playable {
	
	void play();
	
	 static void brand() {
			
			System.out.println("static method");
			
		}
	 default int price(int num) {
		 num = num;
		 System.out.println("default method");
		 return num;
	 }
	 
		 
	}


