package com.xworkz.pendrive;

public class Pendrive {
	
	private String brand;
	private Integer capacity;
	private Integer price;
	
	public Pendrive()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object o)
	{
	System.out.println("invoked equals from pendrive");
	if (o != null)
	{
		System.err.println("ref is not null");
		if(o instanceof Pendrive)
		{
			System.out.println("ref is a valid ref");
			 Pendrive casted=( Pendrive) o;
			String castedBrand=casted.getBrand();
			Integer castedCapacity=casted.getCapacity();
			if(this.brand.equals(castedBrand) && this.capacity.equals(castedCapacity)) {
				System.out.println(" brand and capacity is matching");
			return true;
		}
		else 
		{
			System.err.println("brand and capacity is not matching");
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

	public Pendrive(String brand, Integer capacity, Integer price) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pendrive [brand=" + brand + ", capacity=" + capacity + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
}