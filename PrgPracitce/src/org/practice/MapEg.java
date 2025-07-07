package org.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class MapEg  {
		
	public static void main(String[] args) {
		Map<String,Student> studentlist = new HashMap<>();{
			
		
		Student std = new Student();
		std.id= 77;
		std.name="sindhu";
		
		Student std1 = new Student();
		std1.id=78;
		std1.name = "kannnan";
		
		studentlist.put("student1", std1);
		
		studentlist.put("student2", std);
		//System.out.println(studentlist.entrySet());
	
		
		
		System.out.println(studentlist);
		
		Set<Entry<String,Student>> all = studentlist.entrySet();
		for (Entry<String, Student> s : all) {
			System.out.println(s.getValue().id +s.getValue().name);
			//System.out.println(s.);
			
		}
		
		
		
		
		}
		
		
		
		
		
				
	}

}
