package package1;

public class DefaultEx {
	
	void office() {
		int id = 1001;
		System.out.println(id);
	}

	public static void main(String[] args) {
		DefaultEx def= new DefaultEx();
		def.office();
		String ofz =def.ofzName();
		System.out.println(ofz);
		DefaultSamePackage dsp = new DefaultSamePackage();
		dsp.DOJ();
	}
	String ofzName() {
		String name = "MSP";
		return name;
	}

}
