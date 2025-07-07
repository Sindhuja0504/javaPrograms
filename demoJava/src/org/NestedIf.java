package org;

public class NestedIf {

	public static void main(String[] args) {
		boolean kfc = false;
		boolean chicken = true;
		boolean pepsi = false;
		
		if(kfc ) {
			System.out.println("entered into kfc");
			
			if(chicken) {
				System.out.println("eating chicken");
				
				if(pepsi) {
					System.out.println("drinking  pepsi");
				}
			}
		}

	}

}
