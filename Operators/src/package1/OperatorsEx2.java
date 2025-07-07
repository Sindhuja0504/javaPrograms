package package1;

public class OperatorsEx2 {
	int rose = 20;
	int jass= 10;
	
	void relation() {
		boolean num1= rose> jass;
		System.out.println(num1);
		System.out.println(jass==rose);
		System.out.println(rose!=jass);
		System.out.println(jass<20);
		System.out.println(jass<=20);
	}
	void assign() {
		int x=23; int y =5;
		//System.out.println("x:"+x);
	      x+=10;
	      System.out.println("add: " +x);
	      
	      x-=10;
	      System.out.println("sub: " +x);
	      x*=10;
	      System.out.println(x*=10);//dd
	      System.out.println( x/=10);//dd
	      System.out.println(x%=10);
		
	}
	
	public static void main(String[] args) {
		OperatorsEx2 opx = new OperatorsEx2();
		//opx.relation();
		//opx.assign();	
	}
}
