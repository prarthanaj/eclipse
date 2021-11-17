package com.xworkz.equals.tyre;

public class Tyre {
	TyreType type=TyreType.tire;
	private  String brand;
	private Integer price;
	
	public Tyre() {
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object y)
	{
		System.out.println("invoking equals from tyre");
		if (y != null)
		{
			System.err.println("ref is not null");
			if(y instanceof Tyre)
			{
				System.out.println("ref is TYRE");
				Tyre casted=(Tyre)y;
				String castedBrand=casted.getBrand();
				Integer castedPrice=casted.getPrice();
				if(this.brand.equals(castedBrand) && this.price.equals(castedPrice)) {
					System.out.println("brand and price is matching");
				return true;
			}
				else 
				{
					System.err.println("barnd and price is not matching");
				}
				System.out.println("ref is valid reference");
			}
				else {
					
					System.out.println("cannot be compare ref is not a valid reference from tyre");
					}
			}
				
			else
			{
				System.err.println("ref is null,pass proper ref");
			}
			return false;
		}

	
	public TyreType getType() {
		return type;
	}

	public void setType(TyreType type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	
}
