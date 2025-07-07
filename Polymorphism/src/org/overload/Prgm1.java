package org.overload;

public class Prgm1  {
	String  Tv;
	
	void news1() {
	//	This.("ktv");
		System.out.println("sun news");
	}
	void news1(String Tv) {
		Tv = Tv;
		System.out.println(Tv);
	}

	public static void main(String[] args) {
		Prgm1 demo  = new Prgm1();
		demo.news1("polimer");
		demo.news1();
		//demo.news1();
	}
}
