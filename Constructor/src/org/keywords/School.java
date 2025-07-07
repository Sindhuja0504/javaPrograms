package org.keywords;

public class School{ 
	
	   String scName; 
	   int estYear; 
	   School() 
	   { 
	     scName = "RSVM"; 
	     estYear = 1975; 
	   } 
	   School(String name) 
	   { 
	     scName = name; 
	   } 
	   School(String name, int year) 
	   { 
	     scName = name; 
	     estYear = year; 
	   } 
	   void display() 
	   { 
	      System.out.println(scName+ " " +estYear); 
	   } 
	  public static void main(String[] args) 
	  { 
	   School sc = new School(); 
	   School sc1 = new School("RSVM"); 
	   School sc2 = new School("RSVM",1975); 
	      sc.display(); 
	      sc1.display(); 
	      sc2.display(); 
	    } 
	  }
