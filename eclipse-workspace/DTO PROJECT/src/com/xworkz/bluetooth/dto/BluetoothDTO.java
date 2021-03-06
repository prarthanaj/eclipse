package com.xworkz.bluetooth.dto;

public class BluetoothDTO {
	private String brand;
	private String colour ;
	private int maxVolume ;
	private String type;
	private float distanceCoverage;
	
	public BluetoothDTO()
	{
		
	}
	
	

	public BluetoothDTO(String brand, float distanceCoverage) {
		
		this.brand = brand;
		this.distanceCoverage = distanceCoverage;
	}



	public BluetoothDTO(String brand, String colour, int maxVolume, String type, float distanceCoverage) {
		
		this.brand = brand;
		this.colour = colour;
		this.maxVolume = maxVolume;
		this.type = type;
		this.distanceCoverage = distanceCoverage;
	}



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMaxVolume() {
		return maxVolume;
	}

	public void setMaxVolume(int maxVolume) {
		this.maxVolume = maxVolume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getDistanceCoverage() {
		return distanceCoverage;
	}

	public void setDistanceCoverage(float distanceCoverage) {
		this.distanceCoverage = distanceCoverage;
	}

	
}



