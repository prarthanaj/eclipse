package com.xworkz.equals.Aeroplane;

public class Aeroplane {
	
	private String company;
	private String numb;
	private String govt;
	

	public Aeroplane()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object air)
	{
	System.out.println("invoked equals from aeroplane");
	if (air != null)
	{
		System.err.println("ref is not null");
		if(air instanceof  Aeroplane)
		{
			System.out.println("ref is  Aeroplane");
			 Aeroplane casted=( Aeroplane)air;
			String castedCompany=casted.getCompany();
			String castedGovt=casted.getGovt();
			if(this.company.equals(castedCompany) && this.govt.equals(castedGovt)) 
			{
				System.out.println("company and govt is matching");
			return true;
		}
			else 
			{
				System.err.println("company and govt is not matching");
			}
			System.out.println("ref is  a aeroplane");
		}
			else {
				
				System.out.println("i cannot compare ref is not a aeroplane");
				}
		}
			
		else
		{
			System.err.println("ref is null,pass proper ref");
		}
		return false;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	public String getNumb() {
		return numb;
	}

	public void setNumb(String numb) {
		this.numb = numb;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

}
