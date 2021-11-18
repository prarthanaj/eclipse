package com.xworkz.override.camera;

import java.lang.reflect.Constructor;

public class CameraStarter {

	public static void main(String[] args)
	{
	Camera camera=new Camera();
		camera.setBrand("nikon");
		camera.setModelNum(2009);
		camera.setPrice(43999);
		camera.setCompany("mitsubishi");
		
		 System.out.println(camera.hashCode());
		 System.out.println(camera.toString());
		 System.out.println(camera);
		
		    Camera camera2=new Camera();
			camera2.setBrand("canon");
			camera2.setModelNum(2009);
			camera2.setPrice(31999);
			camera2.setCompany(" ");
			
			 System.out.println(camera2.hashCode());
			 System.out.println(camera2.toString());
			 System.out.println(camera2);
			
			
		
		boolean same=camera.equals(camera2);
		System.out.println(same);
		
		  
		Class clas=camera.getClass();
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
	}
}
