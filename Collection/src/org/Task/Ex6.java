package org.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex6 {

	public static void main(String[] args) {
		//Converting a List to Map
		List<Student> studentlist  =new ArrayList<>();
		studentlist.add(new Student(1, "Bob"));
		studentlist.add(new Student(2, "Alice"));
		studentlist.add(new Student (3, "Charlie"));
		
		//Map<Integer, Student> studentmap = new  studentlist.stream();
		
		

		
//		List<Student> studentList = new ArrayList<>();
//		        studentList.add(new Student(2, "Bob"));
//		        studentList.add(new Student(1, "Alice"));
//		        studentList.add(new Student(3, "Charlie"));
//
//		        // Convert the list to a map (keyed by ID, value is Student object)
//		        Map<Integer, Student> studentMap = studentList.stream()
//		                .collect(Collectors.toMap(Student::getId, student -> student));
//
//		        // Print the resulting map
//		        studentMap.forEach((id, student) -> System.out.println("ID: " + id + ", Student: " + student.getName()));
//		    }
//		}
//

	}
}
