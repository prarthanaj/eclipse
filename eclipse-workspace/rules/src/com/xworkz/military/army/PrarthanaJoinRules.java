package com.xworkz.military.army;

public class PrarthanaJoinRules implements MilitaryJoinRules {
	
	public PrarthanaJoinRules() {
		System.out.println("invoked prarthana join rules");
		}

	@Override
	public double height() {
	System.out.println("invoke required height ");
		return 5.5;
	}

	@Override
	public int age() {
		System.out.println("invoke age");
		return 22;
	}

	@Override
	public String nationality() {
	System.out.println("invoke nationality");
		return "Indian";
	}
	
	

}
