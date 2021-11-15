package com.xworkz.factory;

public class Factory {
	
	public Factory()
	{
		System.out.println("invoked Factory");
	}
	
	public void manufacture()
	{
		System.out.println("invoked manufacture from factory");
	}
	
	public void open()
	{
		System.out.println("invoked open from factory");
	}
	
	public void shutdown() {
		System.out.println("invoked shutdown from factory");
	}
	
	public String toString() 
	{
		System.out.println("invoked toString from factory");
		return "FACTORY";
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}


}
