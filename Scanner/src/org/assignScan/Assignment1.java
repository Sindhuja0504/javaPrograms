package org.assignScan;

import java.util.Scanner;

public class Assignment1 {
	int empId;
    String empName;
    String empEmail;
    int empPhoneno;
    int empSalary;
    String empGender;
    String empCity;
    public static void main(String[] args) {
    	Scanner ass= new Scanner(System.in);
    	System.out.println("Enter empId"); 
    	System.out.println("empId:" +ass.next());
    	
    	System.out.println("Enter empName"); 
    	System.out.println("empName:" +ass.next()); // doubt- one, two word
    	
    	System.out.println("Enter empEmail"); 
    	System.out.println("empEmail:" +ass.next());
    	
    	System.out.println("Enter empPhoneno"); 
    	System.out.println("empPhoneno:" +ass.nextInt());
    	
    	System.out.println("Enter empSalary"); 
    	System.out.println("empSalary:" +ass.nextFloat());
    	
    	System.out.println("Enter empGender"); 
    	System.out.println("empGender:" +ass.next());
    	
    	System.out.println("Enter empCity"); 
    	System.out.println("empCity:" +ass.next());
    	
		
	}
    

}
