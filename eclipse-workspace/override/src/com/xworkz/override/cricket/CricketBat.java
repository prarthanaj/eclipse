package com.xworkz.override.cricket;

public class CricketBat {

	private String companyName;
	private Integer price;
	private String wood;
	private BatTypes types=BatTypes.GM;
	
	public CricketBat()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object o)
	{
	System.out.println("invoked equals from cricket bat");
	if (o != null)
	{
		System.err.println("ref is not null");
		if(o instanceof CricketBat)
		{
			System.out.println("ref is a valid ref");
			CricketBat casted=(CricketBat) o;
			String castedCompanyName=casted.getCompanyName();
			String castedWood=casted.getWood();
			if(this.companyName.equals(castedCompanyName) && this.wood.equals(castedWood)) {
				System.out.println("company name nd wood is matching");
			return true;
		}
		else 
		{
			System.err.println("name or wood is not matching");
		}
		System.out.println("ref is cricket bat");
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
	
	public CricketBat(String companyName, Integer price, String wood, BatTypes types) {
		super();
		this.companyName = companyName;
		this.price = price;
		this.wood = wood;
		this.types = types;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getWood() {
		return wood;
	}

	public void setWood(String wood) {
		this.wood = wood;
	}

	public BatTypes getTypes() {
		return types;
	}

	public void setTypes(BatTypes types) {
		this.types = types;
	}
	
	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 46;
	}

	public String toString() {
		System.out.println("invoked toString from cricketbat");
		return "BAT";
	}
	
	
}
