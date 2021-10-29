package com.xworkz.charger.dto;

public class ChargerDTO {
	
	private String brand;
	private String colour;
	private String connectorType;
	private String type;
	private int amphere;
	
	public ChargerDTO()
	{
		
	}

	public ChargerDTO(String brand) {
		super();
		this.brand = brand;
	}

	public ChargerDTO(String brand, String colour, String connectorType, String type, int amphere) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.connectorType = connectorType;
		this.type = type;
		this.amphere = amphere;
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

	public String getConnectorType() {
		return connectorType;
	}

	public void setConnectorType(String connectorType) {
		this.connectorType = connectorType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmphere() {
		return amphere;
	}

	public void setAmphere(int amphere) {
		this.amphere = amphere;
	}

	
}
