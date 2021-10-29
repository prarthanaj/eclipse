package com.xworkz.solar.dto;

public class SolarDTO {

	private String brand;
	private int amphere;
	private int volts;
	
	public SolarDTO()
	{
		
	}

	public SolarDTO(String brand, int amphere, int volts) {
		
		this.brand = brand;
		this.amphere = amphere;
		this.volts = volts;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getAmphere() {
		return amphere;
	}

	public void setAmphere(int amphere) {
		this.amphere = amphere;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
	
	
}
