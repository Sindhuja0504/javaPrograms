package org.college;

public class Student extends Hostel{
	public void studentName() {
		System.out.println("student name: xxxx");
		
	}
	public void studentDept() {
		System.out.println("student dept: cs");
			
	}
	public void studentId() {
		System.out.println("student id: cs23");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.studentName();
		std.studentDept();
		std.studentId();
		College clg = new College();
		clg.collegeCode();
		clg.collegeName();
		clg.collegeRank();
		Dept dpt = new Dept();
		dpt.deptName();
		Hostel hstl = new Hostel();
		std.hotelName();
		
		
		
	}
}


