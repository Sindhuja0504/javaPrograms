package org.packDT;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		LocalDate obj=LocalDate.now();
		System.out.println(obj);
		
//		Date date=new Date();
		LocalTime myobj=LocalTime.now();
		System.out.println(myobj);
//		
		DateTimeFormatter myFormatobj=DateTimeFormatter.ofPattern("dd-yyyy  HH:mm:ss");
		LocalDateTime myDateObj=LocalDateTime.now();
		String fd=myDateObj.format(myFormatobj);
		System.out.println(fd);
	} 

	}


