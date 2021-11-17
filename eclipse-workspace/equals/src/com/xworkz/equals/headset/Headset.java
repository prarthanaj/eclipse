package com.xworkz.equals.headset;



public class Headset {

	private String brand;
	private String type;
	private Boolean warranty;
	private String battery;
	
	public Headset()
	{
		System.out.println("invoked no-arg constructor");
	}
	
	@Override
	public boolean equals(Object a)
	{
	System.out.println("invoked equals from headset");
	if (a != null)
	{
		System.err.println("ref is not null");
		if(a instanceof Headset)
		{
			System.out.println("ref is a headset");
			Headset casted=(Headset) a;
			String castedHeadsetBrand=casted.getBrand();
			String castedType=casted.getType();
			if(this.brand.equals(castedHeadsetBrand) && this.type.equals(castedType)) {
				System.out.println("brand and  type is matching");
			return true;
		}
			else 
			{
				System.err.println("brand or type is not matching");
			}
			System.out.println("ref is headset");
		}
			else {
				
				System.out.println("i cannot compare ref is not a headset");
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

	public boolean isWarranty() {
		return warranty;
	}

	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 00;
	}

	public String toString() {
		System.out.println("invoked toString from headset");
		return "HEADSET";
	}
	
	
	
	
}
