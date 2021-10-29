package com.xworkz.vehicle.dto;

public class VehiclesDTO
{
	private String brand;
	private String fuelType ;
	private int number ;
	private String type;
	private float mileage;
	
	public VehiclesDTO()
	{
		
	}

	public VehiclesDTO(String brand, String fuelType, int number, String type, float mileage) {
		super();
		this.brand = brand;
		this.fuelType = fuelType;
		this.number = number;
		this.type = type;
		this.mileage = mileage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	
	
	
}
