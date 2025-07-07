package org;

public class Student {
	
	int rollNo ;
	String name;
	
	  Student(int a, String b) {
		// TODO Auto-generated constructor stub
		 rollNo =a;
		    name = b;
   
	}
                                                                                                                    
	public static void main(String[] args) {
		
		 Student obj = new Student(34,"sindhuja");
		 System.out.println(obj.rollNo);

	}

}
