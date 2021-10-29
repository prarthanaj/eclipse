package com.xworkz.solarstarter;

import com.xworkz.solar.dto.SolarDTO;

public class SolarStarter {
	
	public static void main(String[] args) 
	{
		SolarDTO solarDTO=new SolarDTO();
	     solarDTO.setBrand("venus");
	     solarDTO.setAmphere(20);
	     solarDTO.setVolts(220);
	     
	     
	     String brand=solarDTO.getBrand();
	     int amphere=solarDTO.getAmphere();
	     int volts=solarDTO.getVolts();
	    
	     
	     System.out.println(brand.concat(" ").concat(String.valueOf(solarDTO.getAmphere()).concat(" ")) 
	    .concat(String.valueOf(solarDTO.getVolts()).concat(" ")));
	    		 
	    SolarDTO solarDTO2=new SolarDTO("sunpower",22,240);
	    
	    System.out.println(solarDTO2.getBrand().concat(" ").concat(String.valueOf(solarDTO2.getAmphere()).concat(" ")
	   .concat(String.valueOf(solarDTO2.getVolts())).concat(" ")));
	    
	    
	}

}
