package com.xworkz.indian.election;

import com.xworkz.election.rules.ElectionRules;
import com.xworkz.election.rules.IndianElectionRules;
import com.xworkz.election.rules.ElectionCommission;
public class ElectionCommissionStarter {
	
	public static void main(String[] args)
	{
		ElectionRules electionRules=new IndianElectionRules();
	ElectionCommission head=new ElectionCommission(electionRules);
	head.canVote();
}
}
