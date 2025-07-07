package org.typeCasting;

public class Demo {

	public static void main(String[] args) {
		String str = "123";
		int in = Integer.parseInt(str);
		System.out.println("string to int: "+in);
		
		int num = 123;
		String str1 = String.valueOf(num);//--doubt
		System.out.println("Int to string: "+str1);
		System.out.println("*********************");
		//widening ,automatic
		short s = 77;
		int i= s;
		double d = i;
		System.out.println("short value:" + s);
		System.out.println("short to int value:" + i);
		System.out.println("int to double value:" + d);
		System.out.println("*********************");
		
		//narrrow , manual
		float f = 7845.5f;
		long l = (long)f;
		byte b = (byte)l;
		System.out.println("float value: "+ f);
		System.out.println("float to long value: "+ l);
		System.out.println("long to byte value: "+ b);
		System.out.println("*********************");
		
		long l1 = 1004;
		byte b1 = (byte)l1;
		float f1 = b1;
		int i2 = (int)f1;
		short s2 = (short)i2;
		System.out.println("long value: "+ l1);
		System.out.println("long to byte value: "+ b1);
		System.out.println("byte to float value: "+ f1);
		System.out.println("float to int  value: "+ i2);
		System.out.println("int to short value: "+ s2);
		
		
		
		
	
		
		
		

	}

}
