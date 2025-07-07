package org.abs2;
public abstract class Employee {
	
	int sal;
	static String place = "avadi";
	 
	static {
		System.out.println("static method");
	}
	
	public abstract void CTC();
	public abstract void EmployeeDetails();
	
	protected int monthsal(int sal) {
		
		sal = sal;
		System.out.println(sal);
		return 5;
	}
	
	Employee(String name){
//		this("sindhu");
		System.out.println("inside const:" +place);
	}
	static void office() {
		place = "tnager";
		System.out.println("static method: "+ place);	
	}
	Employee( ){
		this("sindhu");
		
	}
	/*public static void main(String[] args) {
		Employee emp = new Employee
	
}*/
}


