package org.bufffer;

public class Method1 {
	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer("Hi kannan");
		StringBuilder sb = new StringBuilder("Hi kannan");
		System.out.println("Length:"+sb.length());
		//System.out.println("ensure capacity:" + sb.ensureCapacity(40));
		//System.out.println("reverse:"+ sb.reverse());
		System.out.println("indexof:"+ sb.indexOf("H"));
		System.out.println("Capacity: "+ sb.capacity());
		System.out.println("append:" + sb.append('M'));
		System.out.println("char:"+ sb.charAt(3));
		System.out.println("append:" + sb.insert(10, " hello"));
		System.out.println("capacity:"+ sb.capacity());
		System.out.println("delete:"+ sb.delete(9, 14));
		
	

	}

}
