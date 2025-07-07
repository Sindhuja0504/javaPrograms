package org;

public class ReturnType {
	int a, b,c;
	int sum(int a, int b ) {
  	int  c = a+b ;
  	  return c;
  	  
    }
	 // without passing parameter
	String get_name( )
	{
		return "sindhu";
	}
	
	long get_phone( long number)
	{
		return number;
	}
	String get_address(String address)
	{
		return address;
	}
	public static void main(String[] args) {
		
		ReturnType obj = new ReturnType();
	        int c  =   obj.sum(10, 10);
	        
	        System.out.println("add: " + c);
	       
	        String name=  obj.get_name();
	        System.out.println(name);
	        
	        long number = obj.get_phone(12345678923l);
	        System.out.println(number);
	        
	        String place =obj.get_address("no.7, chennai");
	        System.out.println(place);

	}

}
