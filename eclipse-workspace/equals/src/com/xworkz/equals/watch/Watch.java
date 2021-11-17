package com.xworkz.equals.watch;

public class Watch {
	
	private String brand;
	private String type;
	private Integer price;
	
	public Watch()
	{
		System.out.println("invoked no-arg constructor");
	}
	
	
	@Override
	public boolean equals(Object q)
	{
	System.out.println("invoked equals from watch");
	if (q != null)
	{
		System.err.println("ref is not null");
		if(q instanceof Watch)
		{
			System.out.println("ref is a brand");
			Watch casted=(Watch) q;
			String castedWatchBrand=casted.getBrand();
			String castedType=casted.getType();
			if(this.brand.equals(castedWatchBrand) && this.type.equals(castedType)) {
				System.out.println("brand and  type is matching");
			return true;
		}
			else 
			{
				System.err.println("brand or type is not matching");
			}
			System.out.println("ref is watch");
		}
			else {
				
				System.out.println("i cannot compare ref is not a watch");
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

	public String toString() {
		System.out.println("invoked toString from watch");
		return "WATCH";
	}

}
