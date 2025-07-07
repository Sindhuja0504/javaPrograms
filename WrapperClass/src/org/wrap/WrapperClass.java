package org.wrap;

public class WrapperClass {
	public void wpc()
	{
	System.out.println("Wrapper class output");
	}
	public static void main(String[] args) {
		
		//datatype variablename=value;
		int pri=95; //primitive datatype
		Integer itg = Integer.valueOf(95);//boxing, wrapping
		int j=itg.intValue();//unboxing,unwrapping
		System.out.println("j value: "+j);
		System.out.println(itg);
		System.out.println(pri+itg);


	}

}
