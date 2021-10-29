package com.xworkz.vehiclestarter;

import com.xworkz.vehicle.dto.VehiclesDTO;

public class VehicleStarter {
	public static void main(String[] args) 
	{
	
     VehiclesDTO vehiclesDTO=new VehiclesDTO();
     vehiclesDTO.setBrand("RE");
     vehiclesDTO.setFuelType("petrol");
     vehiclesDTO.setNumber(46);
     vehiclesDTO.setType("motorbike");
     vehiclesDTO.setMileage(30);
     
     String brand=vehiclesDTO.getBrand();
     String fuelType=vehiclesDTO.getFuelType();
     int number=vehiclesDTO.getNumber();
     String type=vehiclesDTO.getType();
     float mileage=vehiclesDTO.getMileage();
     
     System.out.println(brand.concat(" ").concat(fuelType).concat(" ").concat(String.valueOf(vehiclesDTO.getNumber()).concat(" ")) 
    .concat(" "). concat(type).concat(" ").concat(String.valueOf(vehiclesDTO.getMileage()).concat(" ")));
    		 
    VehiclesDTO vehiclesDTO2=new VehiclesDTO("ford","diesel",46,"car",16);
    
    System.out.println(vehiclesDTO2.getBrand().concat(" ").concat(vehiclesDTO2.getFuelType()).concat(" ").
    		concat(String.valueOf(vehiclesDTO2.getNumber()).concat(" ")
   .concat(vehiclesDTO2.getType()).concat(" ").concat(String.valueOf(vehiclesDTO2.getMileage())).concat(" ")));
    
    
}
}
