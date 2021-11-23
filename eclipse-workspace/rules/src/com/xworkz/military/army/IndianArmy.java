package com.xworkz.military.army;

public class IndianArmy {
	
	private MilitaryJoinRules militaryJoinRules;
	
	public IndianArmy(MilitaryJoinRules militaryJoinRules)
	{
		this.militaryJoinRules=militaryJoinRules;
	}
	
	public void joinUs()
	{
		System.out.println("invoked join us");
		
		int age=militaryJoinRules.age();
		double height=militaryJoinRules.height();
		String nationality=militaryJoinRules.nationality();
		
		if(age>18 && age<42 && height>5.0 && "Indian".equals(nationality)) {
			
			System.out.println("can join");
		}
		else
		{
			System.err.println("cannot join");}}}