package com.xworkz.equals.belt;

public class BeltStarter {
	

	public static void main(String[] args)
	{
		
		
		Belt belt=new Belt();
		belt.setPrice(3000);
		belt.setMaterial("Leather");
		belt.setSize(28);
		belt.setGender("female");
	
	   System.out.println(belt.hashCode());
	   System.out.println(belt.toString());
		
	   Belt belt2=new Belt();
		belt2.setPrice(3000);
		belt2.setMaterial("Leather");
		belt2.setSize(28);
		belt2.setGender("female");
	
	   System.out.println(belt.hashCode());
		
		if(belt==belt2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=belt.equals(belt2);
		System.out.println(same);
	}


}
