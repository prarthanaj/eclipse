package com.xworkz.factory;

public class SugarFactory extends Factory 
{
	public void manufacture()
	{
		System.out.println("invoked manufacture from sugarfactory");
	}
	
	public String toString() 
	{
		System.out.println("invoked toString from sugarfactory");
		return "SUGARFACTORY";
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 01;
	}
	
	

}
