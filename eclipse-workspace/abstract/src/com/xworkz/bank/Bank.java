package com.xworkz.bank;

public abstract class Bank {

	private String name;
	private String ifscCode;
	
	public Bank (String name,String ifscCode)
	{
		this.name=name;
		
		this.ifscCode=ifscCode;
		
	}
	
	public Bank()
	{
		System.out.println("no-arg construct");
	}
	
	public abstract void provideLoan();
	public abstract void openAccount();

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getIfscCode() {
		return ifscCode;
	}
}
