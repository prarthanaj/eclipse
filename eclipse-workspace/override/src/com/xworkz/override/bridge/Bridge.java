package com.xworkz.override.bridge;

public class Bridge {
	

	private String name;
	private Integer openYear;
	private Integer length;
	
	public Bridge()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object o)
	{
	System.out.println("invoked equals from bridge");
	if (o != null)
	{
		System.err.println("ref is not null");
		if(o instanceof Bridge)
		{
			System.out.println("ref is a valid ref");
			Bridge casted=(Bridge) o;
			String castedName=casted.getName();
			Integer castedOpenYear=casted.getOpenYear();
			if(this.name.equals(castedName) && this.openYear.equals(castedOpenYear)) {
				System.out.println(" name nd open year is matching");
			return true;
		}
		else 
		{
			System.err.println("name oropen year is not matching");
		}
		System.out.println("ref is valid");
	}
		else {
			
			System.out.println("i cannot compare ref is not a valid");
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

	
	

	public Integer getOpenYear() {
		return openYear;
	}

	public void setOpenYear(Integer openYear) {
		this.openYear = openYear;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Bridge(String name, Integer openYear, Integer length) {
		super();
		this.name = name;
		
		this.openYear = openYear;
		this.length = length;
	}
	

	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

	public String toString() {
		System.out.println("invoked toString from bridge");
		return "BRIDGE";
	}
	
}
