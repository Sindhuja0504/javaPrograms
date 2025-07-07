package pck.parameters;

public class ParametersEx2 {
	int a;
	
	void byValue(int a) {
		a= a+10;
		System.out.println(a);
	}
	void byRef(ParametersEx2 d) {
		a=10;
		
	}

	public static void main(String[] args) {
		ParametersEx2 d = new ParametersEx2();
		System.out.println(d.a);//0
		d.byValue(100);//110, 
		System.out.println(d.a);//100
		d.byRef(d);
		System.out.println(d.a);
		

	}

}
