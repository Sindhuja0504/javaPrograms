package package1;
import package2.*;
public class Employee extends ProtectedEx2 {
	
	public void details() {
			 String name = "bottle";
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.details();
		e1.sub1();                            
		//e1.add1();
		//System.out.println(e1.a);
		
	}
	
	

}
