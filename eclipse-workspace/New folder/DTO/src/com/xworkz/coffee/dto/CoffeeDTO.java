package com.xworkz.coffee.dto;

public class CoffeeDTO {
	
	private String brand;
	private float caffinePercentage;
	private String flavour;
	private String type;
	private int quantity;
	
	public CoffeeDTO()
	{
		
	}

	public CoffeeDTO(String brand, int quantity) {
		super();
		this.brand = brand;
		this.quantity = quantity;
	}

	public CoffeeDTO(String brand, float caffinePercentage, String flavour, String type, int quantity) {
		super();
		this.brand = brand;
		this.caffinePercentage = caffinePercentage;
		this.flavour = flavour;
		this.type = type;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getCaffinePercentage() {
		return caffinePercentage;
	}

	public void setCaffinePercentage(float caffinePercentage) {
		this.caffinePercentage = caffinePercentage;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
