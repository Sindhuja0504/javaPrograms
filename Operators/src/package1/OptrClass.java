package package1;

public class OptrClass {

	int s=100+50;//150
	int s1=s+250;//400
	int s2=s1+s1;//800
	
	void arith()
	{
		int sum=s+s1;
		int sub=s2-s1;
		int mul=s*s;
		int div=s/s1;
		int mod=s2%s1;
		System.out.println("Addition"+sum+"Subtraction"+sub+"Multiplicatoin"+mul+"Division"+div);
	}
	void assign()
	{
		int x=10;
		int y=x+10;
		s+=5;
		System.out.println(s);
	}
	void logical()
	{
		int x=6;
		int y=9;
		System.out.println(x>5 && x<10);//true ,true
		System.out.println(x<5 || x<10);//false ,true
		System.out.println();
		System.out.println(!(y<5 && y<10));//false,true
	}
public static void main(String[] args) {
	OptrClass o=new OptrClass();
	o.arith();
	o.assign();
	o.logical();
}
}


