package org;

public class Garden {
	
	int apple_price = 20;
	int apple_count = 5;
	
	void total_money() {
		int total = apple_price *apple_count;
		System.out.println("the total ap[ple price is : " +total);
	}
	
	void get_chocolate(float kg) {
		
		System.out.println(kg);
		
	}
	
	void get_powder(String name) {
		
		System.out.println("the powder name :" +name);
		
	}


	public static void main(String[] args) {
		
		Garden num = new Garden();
		num.total_money();
		num.get_chocolate(5.4f);
		num.get_powder("kannan");
		
 
	}

}
