package com.xworkz.factorystarter;

import com.xworkz.factory.Factory;
import com.xworkz.factory.SugarFactory;

public class FactoryStarter {
	public static void main(String[] args)
	{
		Factory factory=new Factory();
		System.out.println("************");
		factory.manufacture();
		factory.open();
		factory.shutdown();
		System.out.println(factory.toString());
		System.out.println(factory);
		System.out.println(factory.hashCode());
		factory.hashCode();
		
		SugarFactory sugarfactory=new SugarFactory();
		System.out.println("************");
		sugarfactory.manufacture();
		System.out.println(sugarfactory.toString());
		System.out.println(sugarfactory);
		System.out.println(sugarfactory.hashCode());
		sugarfactory.hashCode();
		
}
}
