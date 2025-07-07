package package2;

public class Person {
	
	public String Name;
	protected int Age;
	private int ssNo;
	String address;
	
	Person(String name){
		//this(7, Age);
		Name = name;
		
		System.out.println(name);
	}
	Person(int age, int ssno){
		Age = age;
		this.ssNo = ssno;
		System.out.println(age);
		System.out.println(ssno);
	
		
	}
	public static void main(String[] args) {
		Person p = new Person("helo");
	}
	   

}
