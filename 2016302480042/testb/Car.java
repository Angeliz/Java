package org.whuims.testb;

public class Car extends Vehicle{
	@Override
	public void run()
	{
        System.out.println("Car Run.");
	}

	public void ring() 	
	{
        System.out.println("Car Ring.");
	}

}
