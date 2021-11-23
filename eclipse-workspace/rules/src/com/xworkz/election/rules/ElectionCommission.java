package com.xworkz.election.rules;

public class ElectionCommission {
	
	private ElectionRules electionRules;
	
	public ElectionCommission( ElectionRules electionRules) {
		
		this.electionRules=electionRules;
	}
		
	public void canVote()
	{
		System.out.println("invoked can vote");
		
		int validAge=electionRules.validAge();
		int wardNo=electionRules.wardNo();
		String address=electionRules.addresss();
		int len=address.length();
		System.out.println(len);
		
		if(validAge>18 && wardNo>300 && len>10 && len<50) {
			
			System.out.println("can vote");
		}
		else
		{
			System.err.println("cannot vote");}}}
	