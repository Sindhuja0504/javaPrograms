package org.assignScan;

import java.util.Scanner;

public class Assignment2 {
     int a ;
     double avg;
    void add(int Mark1,int Mark2,int Mark3,int Mark4,int Mark5) {
    	a = Mark1+ Mark2 +Mark3+ Mark4+Mark5;
    	System.out.println("total mark: " + a);
    	avg = a/5;
    	System.out.println("Avarage: " + avg);
    }
    public static void main(String[] args) {
    	Assignment2 cls = new Assignment2();
		Scanner ass2 = new Scanner(System.in);
		System.out.println("Enter the studentId");
		System.out.println("studentId:" + ass2.nextInt());
		
		System.out.println("Enter the studentname");
		System.out.println("StudentName:" + ass2.next());
		
		System.out.println("Enter the mark1");
		int Mark1=ass2.nextInt();
		
		System.out.println("Enter the mark2");
		int Mark2=ass2.nextInt();
		
		System.out.println("Enter the mark3");
		int Mark3=ass2.nextInt();
		
		System.out.println("Enter the mark4");
		int Mark4=ass2.nextInt();
		
		System.out.println("Enter the mark5");
		int Mark5=ass2.nextInt();
		cls.add(Mark1,Mark2,Mark3,Mark4,Mark5);
		
		
	}
    
    

}
