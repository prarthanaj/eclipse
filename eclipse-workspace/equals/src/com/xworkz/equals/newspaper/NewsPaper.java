package com.xworkz.equals.newspaper;

public class NewsPaper {

	private String name;
	private Integer since;
	private String lang;
	
	
	
	public NewsPaper()
	{
		System.out.println("invoked no-arg constructor");
	}

	@Override
	public boolean equals(Object wee)
	{
	System.out.println("invoked equals from  NewsPaper ");
	if (wee != null)
	{
		System.err.println("ref is not null");
		if(wee instanceof  NewsPaper)
		{
			System.out.println("ref is NewsPaper ");
			 NewsPaper casted=( NewsPaper) wee;
			String castedName=casted.getName();
			String castedLang=casted.getLang();
			if(this.name.equals(castedName) && this.lang.equals(castedLang)) {
				System.out.println("name nd lang is matching");
			return true;
		}
			else 
			{
				System.err.println("name and lang is not matching");
			}
			System.out.println("ref is  a NewsPaper ");
		}
			else {
				
				System.out.println("i cannot compare ref is not a NewsPaper");
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



	public Integer getSince() {
		return since;
	}



	public void setSince(Integer since) {
		this.since = since;
	}



	public String getLang() {
		return lang;
	}



	public void setLang(String lang) {
		this.lang = lang;
	}

	public int hashCode()
	{
		System.out.println("invoke unique code");
		return 001;
	}

	public String toString() {
		System.out.println("invoked toString from icecream");
		return "news";
	}
	
	
	
	
}
