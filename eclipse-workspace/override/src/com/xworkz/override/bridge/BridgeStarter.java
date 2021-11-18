package com.xworkz.override.bridge;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class BridgeStarter {
	
	public static void main(String[] args)
	{
		Bridge bridge=new Bridge();
		bridge.setName("BANDRA WORLI SEA BRIDGE");
		bridge.setOpenYear(2009);
		bridge.setLength(5600);
		
		 System.out.println(bridge.hashCode());
		 System.out.println(bridge.toString());
		 System.out.println(bridge);
		
		 Bridge bridge2=new Bridge();
			bridge2.setName("BANDRA WORLI SEA BRIDGE");
			bridge2.setOpenYear(2009);
			bridge2.setLength(5600);
			
			 System.out.println(bridge2.hashCode());
			 System.out.println(bridge2.toString());
			 System.out.println(bridge2);
			
		
		boolean same=bridge.equals(bridge2);
		System.out.println(same);
		
		  
		Class clas=bridge.getClass();
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