package com.xworkz.models;

public class VehicleOperator {
	private String[] container=new String[5];
	private int count=0;
	
	public VehicleOperator() {
		System.out.println("invoked no arg const");
	}
	
	public void add(String modelNum) 
	{
		System.out.println("invoked add");
		
		if(modelNum!=null && this.count<this.container.length)
		{
			this.container[count]=modelNum;
			count++;
			System.out.println("Added modelNum".concat(modelNum));
		}
		else {
			System.err.println(" model number cannot be null");
		}
	}
	public void displayModelNumber()
	{
		System.out.println("invoked displayModelNumber");
		for(int number=0;number<this.container.length;number++)
		{
			String ref=this.container[number];
			System.out.println(ref);
			

}
	}

}
