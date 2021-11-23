package com.xworkz.election.rules;

public class IndianElectionRules implements ElectionRules {
	
	public IndianElectionRules() {
		System.out.println("invoked indian election rules");
		}

	@Override
	public int validAge() {
		
		return 18;
	}

	@Override
	public int wardNo() {
		
		return 26;
	}
	@Override
	public String addresss() {
		
return "NTB road jannapura bdvt";
}
	}