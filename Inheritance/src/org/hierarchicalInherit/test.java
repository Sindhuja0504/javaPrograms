package org.hierarchicalInherit;

public class test {

	public static void main(String[] args) {
		B b= new B();
		b.print_A();
		b.print_B();
		
		C c =new C();
		c.print_C();
		c.print_A();
		
		D d=new D();
		d.print_A();
		d.print_D();
		
		
	}

}
