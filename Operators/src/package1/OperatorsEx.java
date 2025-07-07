package package1;

public class OperatorsEx {
	int a =12;
	int b = 3;
	int c = 10;
	
	int s=100+50;//
	void assign()
	{
		int x=10;
		int y=x+10;
		s+=5;  //s=s+5
		System.out.println(s);
	}
	void arith() {
		int add = a+ c;
		int sub = a-c;
		int multi= 12*10;
		int div = 12/3;
		int modulo = c%b;
		System.out.println("add:"+add+" "+"multi:"+multi+" "
		                  +"div:"+div+" "+"mod:"+modulo);
	}

	public static void main(String[] args) {
		OperatorsEx opr = new OperatorsEx();
		opr.assign();
		opr.arith();
		opr.logic();
		System.out.println("inside main method s:" + opr.s);
	}
	void logic() {
		boolean num1= a>c && b<a; //t&& t
		           //12>10 && 3<12
		boolean num2 = c<=b || a>s;//f&& t
		             //10<=3 || 12>150
		boolean num3= (!(num1 || num2));//
		//System.out.println("num3: "+ num3);
		System.out.println("num1:"+num1+" "+"num2:"+num2);
		System.out.println(num1 && num2);
		
	}

}
