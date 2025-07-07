package org;

class Animalss {
	String name;
	int age;

	void makesound() {
		System.out.println("Animals makes sound");
	}
}

class dog1 extends Animalss {
	String breed;

	@Override
	void makesound() {
		
	}

	void fetch() {
		System.out.println("Dog1 is fetching");
	}

	}
class cat extends Animalss{
	String color;
	@Override
	void makesound() {
		System.out.println("cat meows");
	}
	void climb() {
		System.out.println("cat is climbing");
	}
}

public class InheritanceType1 {

	public static void main(String[] args) {
		dog1 d1 = new dog1();
		d1.breed = "puppy";
		d1.name= "shero";
		d1.age= 2;
		d1.makesound();
		d1.fetch();
	}

}
