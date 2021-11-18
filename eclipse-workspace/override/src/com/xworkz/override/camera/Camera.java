package com.xworkz.override.camera;

public class Camera {

	private String brand;
	private Integer modelNum;
	private Integer price;
	private String company;
	
	public Camera()
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
		if(o instanceof Camera)
		{
			System.out.println("ref is a valid ref");
			Camera casted=(Camera) o;
			String castedBrand=casted.getBrand();
			Integer castedModelNum=casted.getModelNum();
			if(this.brand.equals(castedBrand) && this.modelNum.equals(castedModelNum)) {
				System.out.println(" brand and model num is matching");
			return true;
		}
		else 
		{
			System.err.println("brand and model num is not matching");
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

	@Override
	public String toString() {
		return "Camera [brand=" + brand + ", modelNum=" + modelNum + "]";
	}

	public Camera(String brand, Integer modelNum, Integer price, String company) {
		super();
		this.brand = brand;
		this.modelNum = modelNum;
		this.price = price;
		this.company = company;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getModelNum() {
		return modelNum;
	}

	public void setModelNum(Integer modelNum) {
		this.modelNum = modelNum;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}
}
