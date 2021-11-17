package com.xworkz.equals.Food;

public class Food {
	
	private String name;
	private Integer price;
	private String quality;
	private String quantity;
	
	public Food()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object fav)
	{
	System.out.println("invoked equals from fav");
	if (fav != null)
	{
		System.err.println("ref is not null");
		if(fav instanceof Food)
		{
			System.out.println("ref is fooood");
			Food casted=(Food) fav;
			String castedName=casted.getName();
			String castedQuality=casted.getQuality();
			String castedQuantity=casted.getQuality();
			if(this.name.equals(castedName) && this.quality.equals(castedQuality) && this.quantity.equals(castedQuantity)) {
				System.out.println("name , quality nd quantity is matching");
			return true;
		}
			else 
			{
				System.err.println("name,quality nd quantity is not matching");
			}
			System.out.println("ref is  a food");
		}
			else {
				
				System.out.println("i cannot compare ref is not a food");
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

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	

}
