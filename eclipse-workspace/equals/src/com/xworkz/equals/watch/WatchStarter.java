package com.xworkz.equals.watch;

public class WatchStarter {
	
	public static void main(String[] args)
	{
		
		
		Watch watch=new Watch();
		watch.setBrand("onePlus");
		watch.setType("Smart watch");
		watch.setPrice(14000);
		
		System.out.println(watch.toString());
		System.out.println(watch);
		System.out.println(watch.hashCode());
		
		Watch watch2=new Watch();
		watch.setBrand("titan");
		watch.setType("norm");
		watch.setPrice(7000);
		
		System.out.println(watch2.toString());
		System.out.println(watch2);
		System.out.println(watch2.hashCode());
		
		if(watch==watch2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=watch.equals(watch2);
		System.out.println(same);
	}

}
