package org.keywords;

public class KeywordB extends KeywordA{
	
	String Pname;
	public KeywordB(String p) {
		//super(454.78);
		Pname =p;
		
		System.out.println(p);
	}
	KeywordB(int a){
	this("sindhu");
		System.out.println(a);
		
	}
	public KeywordB() {
		this(5);
		System.out.println("hi");


	}
	public static void main(String[] args) {
		KeywordB b = new KeywordB(5);
	
	
		//KeywordB b1 = new KeywordB();
	}

}
