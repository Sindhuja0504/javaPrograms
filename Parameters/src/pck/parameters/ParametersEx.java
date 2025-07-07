package pck.parameters;

public class ParametersEx {
	// Paramaters primitive data type argument
	int a =34 ;
	
	void value(String a, int b) {
		System.out.println(a);
		System.out.println(b);
		
	}
	int  value1() {
		System.out.println("helo");
		System.out.println(a);
	
		return  a =5;
	}
	void value2() {
		System.out.println("hoi");
		 
	}
	
	public static void main(String[] args) {
		ParametersEx pe = new ParametersEx();
		pe.value("raja", 23);
		pe.value("rani", 22);
		//pe.value2();
		pe.value1();
		
		System.out.println(pe.a);
	

	}

}
