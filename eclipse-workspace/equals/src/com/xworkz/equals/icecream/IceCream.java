package com.xworkz.equals.icecream;



public class IceCream {
	
	private String name;
	private String flavour;
	private String type;
	
	public IceCream()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object ice)
	{
	System.out.println("invoked equals from ice");
	if (ice != null)
	{
		System.err.println("ref is not null");
		if(ice instanceof IceCream)
		{
			System.out.println("ref is IceCream");
			IceCream casted=(IceCream) ice;
			String castedName=casted.getName();
			String castedFlavour=casted.getFlavour();
			if(this.name.equals(castedName) && this.flavour.equals(castedFlavour)) {
				System.out.println("name and flavour is matching");
			return true;
		}
			else 
			{
				System.err.println("name or flavour is not matching");
			}
			System.out.println("ref is  a icecream");
		}
			else {
				
				System.out.println("i cannot compare ref is not a icecream");
				}
		}
			
		else
		{
			System.err.println("ref is null,pass proper ref");
		}
		return false;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

	public String toString() {
		System.out.println("invoked toString from icecream");
		return "ICECREAM";
	}
	
	
	
	


}
