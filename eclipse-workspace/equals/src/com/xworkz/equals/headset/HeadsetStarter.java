package com.xworkz.equals.headset;

public class HeadsetStarter {
	
	
	public static void main(String[] args)
	{
		
		
		Headset headset=new Headset();
		headset.setBrand("onePlus");
		headset.setType("wireless");
		headset.setWarranty(true);
		headset.setBattery("chargeable");
		
		System.out.println(headset.toString());
		System.out.println(headset);
		System.out.println(headset.hashCode());
		
		Headset headset2=new Headset();
		headset.setBrand("skull");
		headset.setType("wired");
		headset.setWarranty(true);
		headset.setBattery("non-chargeable");
		
		System.out.println(headset2.toString());
		System.out.println(headset2);
		System.out.println(headset2.hashCode());
		
		
		if(headset==headset2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=headset.equals(null);
		System.out.println(same);
	}


}
