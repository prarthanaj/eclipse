package com.xworkz.equals.shoe;

public class Shoe {
	
	private String brand;
	private Integer size;
	private String colour;
	private String gender;
	
	public Shoe()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object we)
	{
	System.out.println("invoked equals from shoe");
	if (we != null)
	{
		System.err.println("ref is not null");
		if(we instanceof Shoe)
		{
			System.out.println("ref is SHOE");
			Shoe casted=(Shoe) we;
			String castedBrand=casted.getBrand();
			Integer castedSize=casted.getSize();
			if(this.brand.equals(castedBrand) && this.size.equals(castedSize)) {
				System.out.println("brand and size is matching");
			return true;
		}
			else 
			{
				System.err.println("barnd and size is not matching");
			}
			System.out.println("ref is  a shoe");
		}
			else {
				
				System.out.println("i cannot compare ref is not a shoe");
				}
		}
			
		else
		{
			System.err.println("ref is null,pass proper ref");
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

	public String toString() {
		System.out.println("invoked toString from icecream");
		return "Shoe";
	}
	
	
	
}
