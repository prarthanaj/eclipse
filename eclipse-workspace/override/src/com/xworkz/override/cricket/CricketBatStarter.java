package com.xworkz.override.cricket;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CricketBatStarter {

	public static void main(String[] args)
	{
		CricketBat cricketBat=new CricketBat();
		cricketBat.setCompanyName("BAS");
		cricketBat.setPrice(2000);
		cricketBat.setWood("ENGLISH WILLOW");
		
		 System.out.println(cricketBat.hashCode());
		 System.out.println(cricketBat.toString());
		 System.out.println(cricketBat);
		
		    CricketBat cricketBat2=new CricketBat();
	        cricketBat2.setCompanyName("MRF");
			cricketBat2.setPrice(2500);
			cricketBat2.setWood("ENGLISH WILLOW");
			
			 System.out.println(cricketBat2.hashCode());
			 System.out.println(cricketBat2.toString());
			 System.out.println(cricketBat2);
		
		boolean same=cricketBat.equals(cricketBat2);
		System.out.println(same);
		
		  
		Class clas=cricketBat2.getClass();
		System.out.println(clas.getName());
		System.out.println(clas.getPackage());
		System.out.println(clas.getSuperclass());
		System.out.println(clas.getMethods().length);
		System.out.println(clas.getFields().length);
		System.out.println(clas.getConstructors().length);
		
		Constructor[] constructor=clas.getConstructors();
		
		for(int i=0; i<constructor.length; i++)
		{
			Constructor constructors=constructor[i];
			System.out.println(constructors.getName());
			System.out.println(constructors.getParameterCount());
		}
		
		
		Method[] methods=clas.getMethods();
		for(int i=0; i<methods.length;i++)
		{
			Method method=methods[i];
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getModifiers());
			System.out.println(method.getReturnType());
		}
	
	}

	
}
