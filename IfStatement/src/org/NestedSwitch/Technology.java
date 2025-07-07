package org.NestedSwitch;

public class Technology {
	public static void main(String[] args) {
		
	//E - ECE, C - CS, I - Information Technology.
      char branch = 'E';
	   int collegeYear = 3;
	
	  switch(branch) {
	case 'E':
	switch(collegeYear) // Inner switch
     {
	case 3:
	System.out.println("Microcontroller, Power Electronics, Analog circuit, Digital circuit");
	break;
	}
	break;
      case 'C':
	switch(collegeYear) // Inner switch.
	{
	case 3:
	System.out.println("Java, Python, Data structure"); 
	break;
    }
     break; 
      case 'I': 
	   switch(collegeYear) {
	 case 3:
	 System.out.println("EDC, Java, Data structure, Microprocessor"); 
     break;
      }
    break;
    default:
    	System.out.println("invalid selection");
    	break;
	  }
	
	}

}
