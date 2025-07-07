package org.abs2;

public class Worker extends Employee{
	
	static String name = "RAJA";

	@Override
	public void CTC() {
		
		
	}

	@Override
	public void EmployeeDetails() {

        System.out.println(name);
		
	}
	public static void main(String[] args) {
		Worker wrk = new Worker();
		int sal = wrk.monthsal(30000);
		System.out.println("sal" + sal);
		//Employee emp = new Employee
		wrk.office();
		wrk.EmployeeDetails();
	}
	

}
