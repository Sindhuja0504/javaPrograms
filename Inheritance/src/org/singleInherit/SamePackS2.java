package org.singleInherit;

public class SamePackS2 extends SamePackS1 {
	//int v;
	private int sub() {
		System.out.println("sub method");
		return 11-4;
	}
	 public void  multi() {
		int v = a*a;
		System.out.println(v);
		 
	 }
	public static void main(String[] args) {
		SamePackS2 num = new SamePackS2();
		num.multi();
		num.number();
		num.add();
		int r = num.sub();
		System.out.println("return value:" + r);
	}

}
