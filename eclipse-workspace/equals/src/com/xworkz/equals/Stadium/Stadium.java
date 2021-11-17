package com.xworkz.equals.Stadium;

public class Stadium {
	private String name;
	private String city;
	
	public Stadium() {
		System.out.println("invoking no arg constructor");
	}
	
	@Override
	public boolean equals(Object we)
	{
	System.out.println("invoked equals from stadium");
	if (we != null)
	{
		System.out.println("ref is not null");
		if(we instanceof Stadium)
		{
			System.out.println("ref is valid");
			Stadium casted=(Stadium) we;
			String castedName=casted.getName();
			String castedCity=casted.getCity();
			if(this.name.equals(castedName) && this.city.equals(castedCity)) {
				System.out.println("name and city is matching");
			return true;
		}
			else 
			{
				System.err.println("name or city is not matching");
			}
			System.out.println("ref is  a valid ref of stadium");
		}
			else {
				
				System.out.println("i cannot compare ref is not a valid reference from stadium");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

}
