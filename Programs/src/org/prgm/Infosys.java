package org.prgm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Infosys {
	public static void main (String [] args) {
		String str = "Java is was Java";
	String[] s=	str.split(" ");
		HashMap <String, Integer> map = new HashMap<>();
		for(String  word : s) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
				
			}
			else  {
				map.put(word, 1);
			}
		}
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("keys: "+ entry.getKey() + " values: " + entry.getValue());
			}
			
		}
		
//		String s="rsindhuja0405@gmail.com";
//		
//		HashMap<Character,Integer> map = new HashMap<>();
//		for(int i =0;i<s.length();i++) {
//		char ch=	s.charAt(i);
//		if(map.containsKey(ch)) {
//			map.put(ch, map.get(ch)+1);
//				
//			
//		}else {
//			map.put(ch, 1);
//			
//		}
//			
//		}
//		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println("keys: "+ entry.getKey() + " values: " + entry.getValue());
//				
//			}
//			
//		}
		
		
		

//    int arr[] = {10, 40, 20,50, 90,20, 50};
//    int large = arr[0];
//    int second = arr[0];
//    
//    for(int i=1;i<arr.length;i++) {
//    	
//    	if(arr[i]>large) {
//    		second= large;
//    		large=arr[i];
//    	}
//    	else if(large!=arr[i]&& arr[i]> second) {
//    		second = arr[i];
//    		
//    	}
//    	
//    	   
//    }
//    System.out.println(large);
//    
//    System.out.println(second);
  
    
    
//    String s = "keerthana";
//    
//    
//    Map <Character, Integer> map = new LinkedHashMap<>();
//    Set<Character>  set = new HashSet();
//    Set<Character>  set1 = new HashSet();
//    
//    for(char c : s.toCharArray()) {
//    	map.put(c, map.getOrDefault(c, 0)+1);
//    }
////   System.out.println("original :"+  map);
//   for(Map.Entry<Character,Integer> res:map.entrySet()) {
//	   if(res.getValue() > 1) {
//		   System.out.println(res.getKey() );
//		   System.out.println(res.getValue() );
//
//	   }
//   }
    
//    for(char i :s.toCharArray()) {
//    	if(!set.contains(i)) {
//    		set.add(i);
//    	}
//    	else {
//    		set1.add(i);
//    	}
//    	
//    }
//    System.out.println("original :"+  set);
//    System.out.println("original :"+  set1);
//    
//    int largest = arr[0];
//	int second= arr[0];
//    for(int i=1;i<arr.length;i++) {
//    	
//    	if(arr[i]>largest) {
//    		 
//    	}
//    	
//    	
//    	
//    	
//    	
//    	
//    	
//    }

	}
}
