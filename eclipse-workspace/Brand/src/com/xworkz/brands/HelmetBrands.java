package com.xworkz.brands;

public class HelmetBrands {
	private String[] container=new String[5];
	private int count=0;
	
	public HelmetBrands() {
		System.out.println("invoked no arg const");
	}
	
	public void add(String brandsName) 
	{
		System.out.println("invoked add");
		
		if(brandsName!=null && this.count<this.container.length)
		{
			this.container[count]=brandsName;
			count++;
			System.out.println("Added brandsName".concat(brandsName));
		}
		else {
			System.err.println(" brand name cannot be null");
		}
	}
	public void displayBrandsNames()
	{
		System.out.println("invoked displayBrandsName");
		for(int number=0;number<this.container.length;number++)
		{
			String ref=this.container[number];
			System.out.println(ref);
			
		}
	}

}
