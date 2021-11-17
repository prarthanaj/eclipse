package com.xworkz.equals.Stadium;

public class StadiumStarter {
	
	public static void main(String[] args)
	{
		
		
		Stadium stadium=new Stadium();
		stadium.setName("CHINNASWAMY");
	    stadium.setCity("BNG");
		
		System.out.println(stadium.hashCode());
		
		
		Stadium stadium2=new Stadium();
		stadium2.setName("CHINNASWAmy");
	    stadium2.setCity("BNG");
		
		System.out.println(stadium2.hashCode());
		
		
	
		
		if(stadium==stadium2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=stadium.equals(stadium2);
		System.out.println(same);
	}


}
