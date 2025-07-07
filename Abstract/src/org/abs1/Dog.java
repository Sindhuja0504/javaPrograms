package org.abs1;

public class Dog extends Animal{

	@Override
	void makesound() {
		System.out.println("woof");	
	}
	void gender() {
		
	}
	
	
	Dog() {
		super();
		//String name ;
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		d.makesound();
		Cat c1= new Cat("kittu");
		//Cat c = new Cat();
		c1.makesound();
		
	}
	@Override
	void colour() {
		// TODO Auto-generated method stub
		
	}

}
