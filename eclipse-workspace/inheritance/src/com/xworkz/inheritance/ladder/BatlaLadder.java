package com.xworkz.inheritance.ladder;

public class BatlaLadder extends Ladder {

	public void fold()
	{
		System.out.println("invoked Batlaladder fold");
	}
	
	public void lift()
	{
		System.out.println("invoked fold from batlaladder");
	}
	
	
	
	public void lift(int steps)
	{
		System.out.println("invoked lift from batlaladder");
	}
	
	public String toString() {
		System.out.println("invoked toString from ladder");
		return "BATLA";
	}

	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 1;
	}
}

