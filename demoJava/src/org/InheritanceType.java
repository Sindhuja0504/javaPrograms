package org;
//Multiple inheritance

class Animal{
	void eat() {
		System.out.println("Animals can eat");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("this dog can bark");
	}
}
class puppy extends Dog{
	void weep() {
		System.out.println("this puppy can weep");
	}
}

public class InheritanceType {
	

	public static void main(String[] args) {
		 puppy data = new puppy();
		 data.eat();
	   data.bark();
		 data.weep();
		 
	}

}
