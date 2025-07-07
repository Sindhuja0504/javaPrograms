package org;

class vehical  {
	
	String brand;
	int year;
	void StartEngine(){
		
	}
}
	class car extends vehical{
		String fueltype;
		 
		@Override
		void StartEngine() {
			System.out.println("car engine starts");
		}
		void drive() {
			System.out.println("car is driving");
			
		}
	}
	class truck extends vehical {
		int loadCapacity;
		@Override
		void StartEngine() {
			System.out.println("truck engine starts");
		}
		void haul() {
			System.out.println("truck is hauling");
		}
		
	}
	
public class InheritanceType2 {

	public static void main(String[] args) {
		car c1= new car();
		c1.brand = "BMW";
		c1.year = 24;
		c1.StartEngine();
		
		truck t1 = new truck();
		t1.haul();
		
		
		
		
	}

}
