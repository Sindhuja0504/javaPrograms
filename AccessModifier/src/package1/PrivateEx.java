package package1;

public class PrivateEx {
	int a = 16;
	
	private String name = "sindhu";
	void demo() {
		 
		System.out.println(name);
	}
	public void  demo2() {
		System.out.println(a);
		//demo1();
		//Employee e1 = new Employee();
		//e1.details();
	}
	public static void main(String[] args) {
		PrivateEx p1 = new PrivateEx();
		//Employee e1 = new Employee();
		//e1.details();
		p1.demo();
		p1.demo2();
		p1.demo1();
		p1.demo1("roja");		
	}
	private void demo1() {
		System.out.println("helo");
		
	}
	private void demo1(String a) {
		//a= "my name";
		System.out.println(a);
	}
}
