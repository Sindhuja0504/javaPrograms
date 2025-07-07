package org.abs;

public abstract class Instrument {
	
	
	int age= 2;
	String group ="A";
	
	public void method1() {
		System.out.println(group);
		
	}
	
	abstract void play();
	abstract void tune(); 
	
	

}
