package org;
  
//inheritance
 class dad  {
	 
	 String name = "Ravi";
		int num = 1;
 }
 class son extends dad {

	 // String name ;
 }

public class NewClass {

	public static void main(String[] args) {
	
		son demo = new son();
		//demo.name();
		System.out.println(demo.name);
		System.out.println(demo.num);
	}

}
