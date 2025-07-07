package package1;

public class LogicEx {
	
	void value() {
		int x= 10;
		int y = 2;
		System.out.println(10>2 && y<x);//2<10
		            //t&&t
	}
	void value1() {
		System.out.println(27>7 || 0>0);
	}

	public static void main(String[] args) {
		LogicEx lx = new LogicEx();
		lx.value();
		lx.value1();

	}

}
