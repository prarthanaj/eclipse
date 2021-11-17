package com.xworkz.equals.Aeroplane;

public class AeroplaneRunner {
	
	public static void main(String[] args)
	{
		
		
		Aeroplane aeroplane=new Aeroplane();
		aeroplane.setCompany("AIR ASIA");
	    aeroplane.setNumb("ak6117");
		aeroplane.setGovt("INDIA");
		
	
		System.out.println(aeroplane.toString());
		
		System.out.println(aeroplane.hashCode());
		
		Aeroplane aeroplane3=new Aeroplane();
		aeroplane3.setCompany("AIR ASIA");
	    aeroplane3.setNumb("ak6117");
		aeroplane3.setGovt("INDIA");
		
	
		System.out.println(aeroplane3.toString());
		
		System.out.println(aeroplane3.hashCode());
		
	
	
		
		if(aeroplane==aeroplane3)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=aeroplane.equals(aeroplane3);
		System.out.println(same);
	}



}
