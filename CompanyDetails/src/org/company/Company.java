package org.company;

import org.client.Client;

public class Company extends Client {
	String c;
	
	public void companyName() {
		c= "sss";
		System.out.println(c);
		
	}
	public static void main(String[] args) {	
			Company name = new Company();
			name.companyName();
			name.clientName();
			}
	
}
