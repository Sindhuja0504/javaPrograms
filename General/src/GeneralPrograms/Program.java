package GeneralPrograms;

import java.util.Scanner;

public class Program extends program1{
//1.variables,methods calling,modifier,scanner,passing parameters,return type,operators
	
	public RefPrgm CreateValue(String colour, int count){
		RefPrgm rp = new RefPrgm();
		rp.colour=colour;
		rp.count=count;
		return rp;
		
	}
	
	int a = 26;
	private void first(String name) {
		System.out.println(name);
		Program prg1 = new Program();
		prg1.third(7, "temple");
		
	}
	protected int  second() {
		System.out.println("sec method:" + a); // print the instance variable a
		
		return a=2+5;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		scan.next();
		
		Program prg = new Program();//main method
		System.out.println("main method inside");
		RefPrgm rp =prg.CreateValue("blue", 2);// reference passing parameters
		System.out.println(rp.colour + rp.count);
		
		prg.first("SINDHUJA");// method
		System.out.println(prg.a);
		
		int a =prg.second();//method
		System.out.println("second method return type:" + a);	
		
		prg.logic();
		//program1 cls2 = new program1();
		//cls2.logic();
	}
	void third(int num,String place) {
		System.out.println(num + place);
	}

}


