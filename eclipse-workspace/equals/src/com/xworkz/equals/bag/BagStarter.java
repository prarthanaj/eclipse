package com.xworkz.equals.bag;


public class BagStarter {
	
	public static void main(String[] args)
	{
		
		
		Bag bag=new Bag();
		bag.setBrand("wildcraft");
		bag.setColour("green");
		bag.setPrice(2500);
	
		System.out.println(bag.toString());
		
		System.out.println(bag.hashCode());
		

		Bag bag2=new Bag();
		bag2.setBrand("wildcraft");
		bag2.setColour("GREEN");
		bag2.setPrice(2500);
	
		System.out.println(bag2.toString());
		
		System.out.println(bag2.hashCode());
		
		
		if(bag==bag2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=bag.equals(678);
		System.out.println(same);
	}

}
