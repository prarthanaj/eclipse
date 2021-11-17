package com.xworkz.equals.tyre;

public class TyreStarter {
	
	
	public static void main(String[] args)
	{
		
		
		Tyre tyre=new Tyre();
		tyre.setBrand("MRF");
	    tyre.setPrice(4007);
		
		System.out.println(tyre.toString());
		
		System.out.println(tyre.hashCode());
		
	
		Tyre tyre2=new Tyre();
		tyre2.setBrand("MRF");
	    tyre2.setPrice(4007);
		
		System.out.println(tyre2.toString());
		
		System.out.println(tyre2.hashCode());
		
		Tyre tyre3=new Tyre();
		tyre3.setBrand("MRF");
	    tyre3.setPrice(4507);
		
		System.out.println(tyre3.toString());
		
		System.out.println(tyre3.hashCode());
		
	
		
		if(tyre2==tyre3)
		{
			System.out.println("both pointing to same memory");
		}
		else
		{
		
		boolean same=tyre.equals(tyre2);
		System.out.println(same);
	}


	}
}
