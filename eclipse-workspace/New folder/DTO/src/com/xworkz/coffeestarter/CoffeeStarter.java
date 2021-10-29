package com.xworkz.coffeestarter;

import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeStarter {
	public static void main(String[] args) 
	{
	
     CoffeeDTO coffeeDTO=new CoffeeDTO();
     coffeeDTO.setBrand("sunrise");
     coffeeDTO.setFlavour("black roast");
     coffeeDTO.setQuantity(100);
     coffeeDTO.setCaffinePercentage(35);
     coffeeDTO.setType("filter");
     
     String brand=coffeeDTO.getBrand();
     String flavour=coffeeDTO.getFlavour();
     
     System.out.println(brand.concat(" ").concat(flavour).concat(" ").concat(String.valueOf(coffeeDTO.getQuantity())
    		 .concat(" ").concat(String.valueOf(coffeeDTO.getCaffinePercentage())).concat(" ").concat(coffeeDTO.getType())));
    		 
    CoffeeDTO coffeeDTO2=new CoffeeDTO("nescafe", 20,"choco","filter",100);
    
    System.out.println(coffeeDTO2.getBrand().concat(" ").concat(coffeeDTO2.getFlavour()).concat(" ").concat(String.valueOf(coffeeDTO2.getQuantity())
    .concat(" ").concat(String.valueOf(coffeeDTO2.getCaffinePercentage())).concat(" ").concat(coffeeDTO2.getType())));
    
}
}
