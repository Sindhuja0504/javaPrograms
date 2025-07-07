package org.bufffer;

public class Methods {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Hello, World!");
//	sb.length();
//	sb.delete(3, 4);
//	sb.length();
//	System.out.println(sb);
	sb.append(" How are you?");
    System.out.println("After append: " + sb);
	
	System.out.println("Capacity: " + sb.capacity());

     //charAt()
    System.out.println("Character at index 7: " + sb.charAt(7));

    // delete()
    System.out.println("After delete: " + sb);
    sb.delete(5, 12);
    
    System.out.println("After delete: " + sb);

    // ensureCapacity()
    sb.ensureCapacity(50);
    System.out.println("New capacity: " + sb.capacity());

}
}
