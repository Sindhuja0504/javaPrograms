package org.wrap;

public class Demo {

	public static void main(String[] args) {
		//boxing
		int i =77;
		Integer no = new Integer(i);
		System.out.println("boxing: " +no);
		
		//unboxing
		int no2 =no.intValue();
		System.out.println("unboxing: "+no2);
		
		//auto-boxing
		Integer no1 = i;
		System.out.println("autoboxing: "+no1);
		
		//auto unboxing
		
		int no3 = no1;
		System.out.println("auto unboxing: "+ no3);
	 
	}

}
