package org;

public class DemoForLoop {
	
	public void green() {
		
		System.out.println("hi");
	}

	public void greenG() {
		System.out.println("hi hello");
	}
	public static void main(String[] args) {
		DemoForLoop obj=new DemoForLoop(); // object creation
		obj.green();
		obj.greenG();// method calling
		
		 
		int age[]={18,32,45,32,45};
		
		
		System.out.println("VALUE : "+age.length);

		for (int i=0;i<age.length;i++) {
			//System.out.println(age[i]);
			for (int j=i+1;j<age.length;j++) {
				if(age[i]==age[j]) {
					System.out.println(age[j]);
				}
			}
			
		}
	}

}
