package com.xworkz.equals.sock;

public class Sock {
	
	 private SockBrands brands=SockBrands.NIKE;	
	 private SockType types=SockType.ANKLE;	
	 private Character size;
	 private Integer price;
	 
	 public Sock()
		{
			System.out.println("invoked no-arg constructor");
		}
	 
	 @Override
		public boolean equals(Object we)
		{
		System.out.println("invoked equals from sock");
		if (we != null)
		{
			System.err.println("ref is not null");
			if(we instanceof Sock)
			{
				System.out.println("ref is SHOE");
				Sock casted=(Sock) we;
				Character castedSize=casted.getSize();
				Integer castedPrice=casted.getPrice();
				if(this.size.equals(castedSize) && this.price.equals(castedPrice)) {
					System.out.println("price and size is matching");
				return true;
			}
				else 
				{
					System.err.println("price or size is not matching");
				}
				System.out.println("ref is  a sock");
			}
				else {
					
					System.out.println("i cannot compare ref is not a sock");
					}
			}
				
			else
			{
				System.err.println("ref is null,pass proper ref");
			}
			return false;
		}
	 
	 
	 

	public SockBrands getBrands() {
		return brands;
	}

	public void setBrands(SockBrands brands) {
		this.brands = brands;
	}

	public SockType getTypes() {
		return types;
	}

	public void setTypes(SockType types) {
		this.types = types;
	}

	public Character getSize() {
		return size;
	}

	public void setSize(Character size) {
		this.size = size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	

}
