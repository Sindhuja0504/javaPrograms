package org.practice;

public class StaticEx1 {
	static  int a = 3;//--variable
	static int n;
	
	static {
		System.out.println("block 4");
		System.out.println("int default value: "+ n);
	}
	
	static int first() { //-- method
		System.out.println("block 1:"+a);
		return 10;
	}
	 static {
		 int c= a+a;
		System.out.println("block 3:" +c);
	}
	public static void main(String[] args) {
		StaticEx1 se= new StaticEx1();
		int r =se.first();
		System.out.println("instance var in main: " + a);
		System.out.println("return value : " + r);
		System.out.println(StaticEx1.first());
	}
	static { //--block
		System.out.println("static block 2: "  + a);
	}

}
