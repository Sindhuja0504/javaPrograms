package package1;

import package2.PublicDiffPackage;

public class PublicEx {
	
	public String  a = "john";
	
	public String address(String a) {
		System.out.println("method: " + a);
		
		return a;	
	}
	public void address1() {
		System.out.println("method 2: " +a);
		
		PublicSamePackage psc = new PublicSamePackage();
		 int value =psc.addition();
		 System.out.println("add value: " + value);
	}

	public static void main(String[] args) {
		PublicEx p1 = new PublicEx();
		String fam = p1.address("ajith");
		System.out.println(fam);
		 p1.address1();
		 //PublicSameClass psc = new PublicSameClass();
		 //psc.age();
		 PublicDiffPackage dpc = new PublicDiffPackage();
		 dpc.SchName();
		 

	}

}
