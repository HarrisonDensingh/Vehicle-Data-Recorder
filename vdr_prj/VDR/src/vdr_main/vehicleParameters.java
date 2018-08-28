package vdr_main;

public class vehicleParameters {
	
	static double fuel;
	static double oil;
	static double engineTemp;
	
	public static void main(String args[])
	{
		//Display Fuel level at every 1 hour
		fuel = 12.7;
		System.out.println("Fuel Level in Litters: "+fuel+" - Time:"+java.time.LocalTime.now());
		
		//Display Oil level at every 1 hour
		oil = 6.3;
		System.out.println("Oil Level in Litters: "+oil+" - Time:"+java.time.LocalTime.now());
		
		//Display Engine Temperature at every 1 hour
		engineTemp=163;
		System.out.println("Engine Temperature in celcius: "+engineTemp+" - Time:"+java.time.LocalTime.now());
	}

}
