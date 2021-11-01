package com.xworkz.foodStarter;

import com.xworkz.dto.foodexample.FoodDTO;
import com.xworkz.foodexample.dao.FoodDAO;
import com.xworkz.dto.foodexample.FoodTypes;

public class FoodStarter {
	
	public static void main(String[] args) {
		FoodDAO fooddao=new FoodDAO();

		FoodDTO dto=new FoodDTO(3,"Biriyani",FoodTypes.NORTHINDIAN,170.50,2);
		
        FoodDTO dto1=new FoodDTO(2,"PASTA",FoodTypes.ITALIAN,250.00,3);
		
		fooddao.add(dto);
		fooddao.add(dto1);
		
		fooddao.updatePriceByName("Briyani",30.0f);
		fooddao.updateQuantityByName("FishFRY",4);
		
		fooddao.findByNameAndPrice("Biriyani",200.00);
	
		fooddao.displayDetails();
		fooddao.totalFoodItems();



	}
}
