package com.xworkz.equals.bag;

public class Bag {
	
	private String colour;
	private String brand;
	private Integer price;
	
	public Bag()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object b)
	{
	System.out.println("invoked equals from bag");
	if (b != null)
	{
		System.err.println("ref is not null");
		if(b instanceof Bag)
		{
			System.out.println("ref is bag");
			Bag casted=(Bag) b;
			String castedBagColour=casted.getColour();
			String castedBrand=casted.getBrand();
			if(this.colour.equals( castedBagColour) && this.brand.equals(castedBrand)) {
				System.out.println("colour and brand is matching");
			return true;
		}
			else 
			{
				System.err.println("brand or colour is not matching");
			}
			System.out.println("ref is  a bag");
		}
			else {
				
				System.out.println("i cannot compare ref is not a bag");
				}
		}
			
		else
		{
			System.err.println("ref is null,pass proper ref");
		}
		return false;
	}
	
	
	
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
