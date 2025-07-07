package package2;

public class Employee extends Person{
	//String name;
	
	public Employee(String name){
		super(name);
		//this.name = name;
		System.out.println();
		
	 
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee("hi");
		Person person = new Person(7, 23);
	}

}
