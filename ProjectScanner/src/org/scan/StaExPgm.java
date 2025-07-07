package org.scan;

public class StaExPgm {

 int ph=1234;
static String state="TamilNadu";
public void exMeth()
{
	state="Kerala";
	int atmno=10;
	System.out.println("My State"+state);
}
public void main()
{
	System.out.println("First Exe"+state);
}
public static void main(String[] args) {

	StaExPgm s=new StaExPgm();
	
	s.exMeth();
	System.out.println(state);
	
	s.main();
	System.out.println(s.ph);
}

}