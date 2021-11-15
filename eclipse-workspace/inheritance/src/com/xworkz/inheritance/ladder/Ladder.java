package com.xworkz.inheritance.ladder;

public class Ladder {
	
	public Ladder()
	{
		System.out.println("invoked ladder");
	}
	
	public String toString() {
		System.out.println("invoked toString from ladder");
		return "LADDER";
	}
	
	
	public void lift()
	{
		System.out.println("invoked lift from ladder");
	}
	
	public void fold()
	{
		System.out.println("invoked lift from ladder");
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

}
