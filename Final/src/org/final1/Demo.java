package org.final1;

public final class Demo extends Demo1{
	
	final static int a = 6 ;
	static {
		System.out.println("hi" + a);
	}
	
	Demo(){
		System.out.println("const" );
		
	}
	Demo(String s){
		System.out.println(s);
		
	}
	final public void method1() {
		int a = 10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Demo dd = new Demo();
		Demo d1 = new Demo("string");
		d1.method1();
		d1.method2();
		d1.meth();
	}
	

}
