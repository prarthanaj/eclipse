package com.xworkz.inheritance.carfactory;

public class CarFactory {
	public CarFactory()
	{
		System.out.println("invoked carFactory");
	}
	
	public void manufacture()
	{
		System.out.println("invoked manufacture from carfactory");
	}
	
	public void shutdown()
    {
		System.out.println("invoked shutdown from carfactory");
	}
	
	public String toString() 
	{
		System.out.println("invoked toString from carfactory");
		return "FACTORY";
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 12;
	}


}
