package org;

public class DataTypePractice {
	
	int rollNo = 23;
	String StudentName = "Sri";
	long MobileNo = 1234567890;
	float height = 5.5f;
	char grade = 'a';
	
	 private char testing() {
		 
		 System.out.println(" hey  :" + grade);
		 return grade;
		 
	 }
	 protected void Number() {
		 System.out.println("print :" + MobileNo); 
		
	 }
	
	public static void main(String[] args) {
		DataTypePractice test = new DataTypePractice();
		test.testing();
		test.Number();

		
	
		// TODO Auto-generated method stub

	}

}
