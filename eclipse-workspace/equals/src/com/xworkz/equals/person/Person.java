package com.xworkz.equals.person;

public class Person {
	
	private String name;
	private String email;
	private String city;
	
	public Person()
	{
		System.out.println("invoked no-arg constructor");
	}
	
	@Override
	public boolean equals(Object o)
	{
	System.out.println("invoked equals from person");
	if (o != null)
	{
		System.err.println("ref is not null");
		if(o instanceof Person)
		{
			System.out.println("ref is a person");
			Person casted=(Person) o;
			String castedPersonEmail=casted.getEmail();
			String castedName=casted.getName();
			if(this.email.equals(castedPersonEmail) && this.name.equals(castedName)) {
				System.out.println("email and  name is matching");
			return true;
		}
		else 
		{
			System.err.println("email or name is not matching");
		}
		System.out.println("ref is person");
	}
		else {
			
			System.out.println("i cannot compare ref is not a person");
			}
	}
		
	else
	{
		System.err.println("ref is null,pass proper ref");
	}
	return false;
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
