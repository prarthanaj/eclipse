package com.xworkz.inheritance.carfactory;



public class CarFactoryStarter {
	
		public static void main(String[] args)
		{
			CarFactory carfactory=new CarFactory();
			System.out.println("************");
			carfactory.manufacture();
			
			carfactory.shutdown();
			System.out.println(carfactory.toString());
			System.out.println(carfactory);
			System.out.println(carfactory.hashCode());
			carfactory.hashCode();
	}
	}



