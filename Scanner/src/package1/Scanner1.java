package package1;

import java.util.Scanner;



public class Scanner1 extends Second{
	
	static int a;
	String b;
	
	public static void main(String[] args) {
		
		Scanner1 sc = new Scanner1();
		method1();
		Scanner demo = new Scanner(System.in);
		//demo.nextInt();     
		System.out.println("Enter the int value: ");
		System.out.println("the int value: " + demo.nextInt());
		
		System.out.println("Enter the string value: ");
		System.out.println("the int value: " + demo.next());
	
	}

}
class Second {
	
	static {
		System.out.println("hi");
	}
	public  static  void method1() {
		
	}
}

