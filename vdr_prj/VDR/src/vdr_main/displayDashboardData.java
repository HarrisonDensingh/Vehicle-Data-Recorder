package vdr_main;



public class displayDashboardData {

	static //Get RPM from vehicle sensor
		int RPM =2310;
		
		static //Get Speed from vehicle sensor
		int speed =89;
		
		static //Get Right Indicator state from vehicle electronics
		boolean RIndicator =false;
		
		static//Get Left Indicator state from vehicle electronics
		boolean LIndicator =true;
		
		static//Get head light state from vehicle electronics
		boolean MainLight =true;
		
		static//Get tail light state from vehicle electronics
		boolean TailLight =true;
		
		static // Get Break pressure from pressure sensor
		
		boolean brk =true;
		static int psi= 1230;
		
		
	
public static void main(String args[])
{
	//Display RPM with location
	System.out.println("RPM:"+RPM+" Location: <location from GPS> - Time:"+java.time.LocalTime.now());
	 
	
	//Display Speed with location
	System.out.println("Speed:"+speed+" Location: <location from GPS>- Time:"+java.time.LocalTime.now());
	
	//Display Indicator state with location
	
	if(RIndicator==true)
	{
		System.out.println("Right Indicator is ON:"+" Location: <location from GPS>- Time:"+java.time.LocalTime.now());
	}
	
	if(LIndicator==true)
	{
		System.out.println("Left Indicator is ON: "+" Location: <location from GPS>- Time:"+java.time.LocalTime.now());
	}
	
	//Display Head Light state with location
	if(MainLight==true)
	{
		System.out.println("Head Light is ON:"+" Location: <location from GPS>- Time:"+java.time.LocalTime.now());
	}
	
	//Display Head Light state with location
	if(TailLight==true)
		{
			System.out.println("Tail Light is ON:"+" Location: <location from GPS>- Time:"+java.time.LocalTime.now());
		}
	
	
	//Get Break pressure from pressure sensor. If break is pressed return boolean brk as true and get pressure applied in psi value from sensor.
	if(brk==true){
	System.out.println("Break Pressed?: Yes - "+" PSI: "+psi+ "  - Location: <location from GPS>- Time:"+java.time.LocalTime.now());
		}
		else
			brk =false;
}
}
