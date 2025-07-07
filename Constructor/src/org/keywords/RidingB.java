package org.keywords;

public class RidingB extends RidingA{
	RidingB(){
		System.out.println("child class");
	}
	RidingB(int n){
	super("papa");
		System.out.println("int:" + n);
	}
	public static void main(String[] args) {
		RidingB rb = new RidingB();
		RidingB rb1 = new RidingB(7);
		//RidingB rb2 = new RidingB("KAN");
	}

}
