package com.xworkz.chargerstarter;

import com.xworkz.charger.dto.ChargerDTO;

public class ChargerStarter {

	public static void main(String[] args) 
	{
	
     ChargerDTO chargerDTO=new ChargerDTO();
     chargerDTO.setBrand("protonics");
     chargerDTO.setColour("black");
     chargerDTO.setConnectorType("ctype");
     chargerDTO.setType("mobilecharger");
     chargerDTO.setAmphere(3);
     
     String brand=chargerDTO.getBrand();
     String colour=chargerDTO.getColour();
     String connectorType=chargerDTO.getConnectorType();
     String type=chargerDTO.getType();
     
     System.out.println(brand.concat(" ").concat(colour).concat(" ").concat(connectorType) .concat(" ").
   concat(type).concat(" ").concat(String.valueOf(chargerDTO.getAmphere()).concat(" ")));
    		 
    ChargerDTO chargerDTO2=new ChargerDTO("samsung","white","c","mobilecharger",2);
    
    System.out.println(chargerDTO2.getBrand().concat(" ").concat(chargerDTO2.getColour()).concat(" ").concat(chargerDTO2.getConnectorType())  
    .concat(" ").concat(chargerDTO2.getType()).concat(" ").concat(String.valueOf(chargerDTO2.getAmphere())).concat(" "));
    
    
}
}


