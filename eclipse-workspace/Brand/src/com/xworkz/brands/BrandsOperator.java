package com.xworkz.brands;

public class BrandsOperator {
	private String[] container=new String[5];
	private int count=0;
	
	public BrandsOperator() {
		System.out.println("invoked no arg const");
	}
	
	public void add(String brandName) 
	{
		System.out.println("invoked add");
		
		if(brandName!=null && this.count<this.container.length)
		{
			this.container[count]=brandName;
			count++;
			System.out.println("Added brandName".concat(brandName));
		}
		else {
			System.err.println(" brand name cannot be null");
		}
	}
	public void displayBrandNames()
	{
		System.out.println("invoked displayBrandsName");
		for(int number=0;number<this.container.length;number++)
		{
			String ref=this.container[number];
			System.out.println(ref);
			

}
	}

}


