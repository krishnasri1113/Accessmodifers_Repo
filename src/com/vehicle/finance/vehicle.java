package com.vehicle.finance;

public class vehicle {
	
	private  static String privatevehiclename;
	static String deafultvehiclename;
	protected static String protectedvehiclename;
	public static String publicvehiclename;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	     /*vehicle.privatevehiclename="honda";
	     System.out.println(vehicle.privatevehiclename);
	     */
	     /*vehicle.deafultvehiclename="suzuki";
	     vehicle.protectedvehiclename="Activa";
	     vehicle.publicvehiclename="maruti";
	      
	     System.out.println(vehicle.deafultvehiclename);
	     System.out.println(vehicle.protectedvehiclename);
	     System.out.println(vehicle.publicvehiclename);*/
	     vehicle.run();
	     //vehicle.moving();
	
	

	}
	private static void run()
	{
		System.out.println("vehicle is running");
	}
	
	protected void moving()//you can call the static members using class name
       {
		 vehicle.privatevehiclename="honda";
	     System.out.println(vehicle.privatevehiclename);
	     
		vehicle.deafultvehiclename="van1";
		System.out.println(auto.deafultvehiclename);
		vehicle.protectedvehiclename="scooti1";
		System.out.println(auto.protectedvehiclename);
		vehicle.publicvehiclename="passion1";
		System.out.println(auto.publicvehiclename);
		
	}
	
}