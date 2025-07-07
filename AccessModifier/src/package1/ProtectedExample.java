   package package1;

import package2.ProtectedDiffPackage;

public class ProtectedExample extends ProtectedDiffPackage{
	
	int a = 12;
	protected void  trip() {
		System.out.println(a);
		ProtectedSamePackage psp = new ProtectedSamePackage();
		String plc =psp.place();
		System.out.println(plc);
		
	}

	public static void main(String[] args) {
		ProtectedExample pex = new ProtectedExample();
		pex.trip();
		pex.km();
		pex.group();
	
		
	}

}
