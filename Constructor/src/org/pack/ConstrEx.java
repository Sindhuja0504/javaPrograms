package org.pack;


public class ConstrEx {
	int a = 1;
	int b=2;
	
	public int add() { //-- nrml method
		System.out.println("hi");
		return 2;
	}
	ConstrEx(int a){
		
		System.out.println("hi");
	}
	static void prg() {
		System.out.println("static const");
	}
	
	ConstrEx(int a, int b){  //-- parameterized constr
		System.out.println(a);
		System.out.println(b);
	}
	ConstrEx(){ //no argument constr
		System.out.println("constructor");
	}
	
	
	public static void main(String[] args) {
		ConstrEx con1 = new ConstrEx(67,87);
		ConstrEx con= new ConstrEx();
		con.add();
		
	}
}
