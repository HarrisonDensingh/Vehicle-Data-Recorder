package vdr_main;

public class reportViolations {
	
public static void main (String args[]){ 
	
// Get value from Lane Monitor sensor
		boolean laneMark = true;
// Return 1 if the vehicle is between two lane marking
		int i=0;
		int violation;
	
	{
// Return 0 if the vehicle is moved away from lane marking
	
	if(laneMark==true)
	{
	// Display Message with location
		System.out.println("Vehicle is on Lane mark");
	}
	
	else
	{
	// if the vehicle is moved away from lane marking, Increase count i by 1
		i++;
		
	// if i reaches 5 i.e Vehicle is moved away from lane 5 times
		
		if(i==5)
		{
	// Record Violation and display message
			violation=1;
			System.out.println("Vehicle is on moved from Lane mark" +i+ "times");
			System.out.println("Violation: "+violation);
		}
		
		
	}
}
}
}
	



