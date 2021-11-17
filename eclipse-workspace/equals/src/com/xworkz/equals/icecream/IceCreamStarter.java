package com.xworkz.equals.icecream;

public class IceCreamStarter {
	
	public static void main(String[] args)
	{
		
		
		IceCream icecream=new IceCream();
		icecream.setName("i-cone");
		icecream.setFlavour("oreo");
		icecream.setType("cone");
	
		System.out.println(icecream.toString());
		
		System.out.println(icecream.hashCode());
		
		IceCream icecream2=new IceCream();
		icecream2.setName("i-cone");
		icecream2.setFlavour("orange");
		icecream2.setType("candybar");
	
		System.out.println(icecream2.toString());
		
		System.out.println(icecream2.hashCode());
		
	
		
		if(icecream==icecream2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=icecream.equals(icecream2);
		System.out.println(same);
	}


}
