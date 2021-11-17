package com.xworkz.equals.shoe;


public class ShoeStarter {
	
	public static void main(String[] args)
	{
		
		
		Shoe shoe=new Shoe();
		shoe.setBrand("PUMA");
	    shoe.setColour("WhITE");
		shoe.setSize(7);
		shoe.setGender("female");
	
		System.out.println(shoe.toString());
		
		System.out.println(shoe.hashCode());
		
		Shoe shoe2=new Shoe();
		shoe2.setBrand("PUMA");
	    shoe2.setColour("WHITE");
		shoe2.setSize(7);
		shoe2.setGender("male");
	
		System.out.println(shoe.toString());
		
		System.out.println(shoe.hashCode());
		
	
		
		if(shoe==shoe2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=shoe.equals(shoe2);
		System.out.println(same);
	}


}
