package org.edu;

public class Education extends Arts{
	
	public void ug() {
		System.out.println("ug method");
	}
	public void pg() {
		System.out.println("pg method");
		
	}
	public static void main(String[] args) {
		Education edu = new Education();
		edu.ug();
		edu.pg();
		edu.bA();
		edu.bBA();
		edu.bsc();
		edu.bEd();
		edu.bE();
		edu.bTech();
		edu.physiyo();
		edu.dental();
		edu.mbbs();
	}

}
