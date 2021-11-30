package com.xworkz.compile.event;

import com.xworkz.compile.exception.NotaPrimeMemberException;

public class AmazonPrime {
	
public void primeMember(String country,boolean primeMember ) throws NotaPrimeMemberException
	
	{
		
		if(country=="INDIA"  && primeMember)
		{
			System.out.println("can get free delivery");
		}
		else {
			System.err.println("cannot get");
			throw new NotaPrimeMemberException();
			
		}
		
		
		}
		

}
