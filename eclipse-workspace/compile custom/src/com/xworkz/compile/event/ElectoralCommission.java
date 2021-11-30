package com.xworkz.compile.event;
import com.xworkz.compile.exception.CanVote;

public class ElectoralCommission {

	public void electoralCommissionForVote(String name,int age ) throws CanVote
	
	{
		
		if(name!=null && name.length()>2 && name.length()<26 && age>18)
		{
			System.out.println("can vote");
		}
		else {
			System.err.println("cannot vote");
			throw new CanVote();
		}
		
		
		}
		
}
