package com.xworkz.equals.Food;

public class FoodStarter {
	
	public static void main(String[] args)
	{
		
		
		Food food=new Food();
		food.setName("CHICKEN BIRIYANI");
	    food.setPrice(360);
		food.setQuantity("full");
		food.setQuality("very good");
	
		Food food2=new Food();
		food2.setName(" Mutton BIRIYANI");
	    food2.setPrice(390);
		food2.setQuantity("full");
		food2.setQuality("very good");
	
		
		if(food==food2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=food.equals(food2);
		System.out.println(same);
	}



}
