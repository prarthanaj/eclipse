package com.xworkz.equals.belt;

public class Belt {

	private String material;
	private String gender;
	private Integer size;
	private Integer price;
	
	public Belt()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object abc)
	{
	System.out.println("invoked equals from belt");
	if (abc != null)
	{
		System.err.println("ref is not null");
		if(abc instanceof Belt)
		{
			System.out.println("ref is Belt");
			Belt casted=(Belt) abc;
			Integer castedSize=casted.getSize();
			Integer castedPrice=casted.getPrice();
			if(this.size.equals(castedSize) && this.price.equals(castedPrice)) {
				System.out.println("size and price is matching");
			return true;
		}
			else 
			{
				System.err.println("size or price is not matching");
			}
			System.out.println("ref is  a belt");
		}
			else {
				
				System.out.println("i cannot compare ref is not a belt");
				}
		}
			
		else
		{
			System.err.println("ref is null,pass proper ref");
		}
		return false;
	}
	
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

	public String toString() {
		System.out.println("invoked toString from icecream");
		return "Belt";
	}
	
	
	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	

}
