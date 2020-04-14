package com.vehicle.reception;

import com.vehicle.finance.vehicle;

public class bus extends vehicle
{
	//i can acess the protected variables and protected method in the sub classes
	//here bus is sub class in one package and vehicle is the base class in other package
    public static void main(String[] args) {
    	bus b=new bus();
    	b.moving();
		
	
    
}
}
