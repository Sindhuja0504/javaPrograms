package org;


class person{
	String name;
	
	person(String name){
		this.name = name;
	}
}
class Employee extends person{
	
	Employee(String name)
	{
		super(name);
		System.out.println(name);
	  
	}
	

	
}
public class SuperClass {

	public static void main(String[] args) {
		Employee e1 = new Employee("sindhu");
		

	}

}
