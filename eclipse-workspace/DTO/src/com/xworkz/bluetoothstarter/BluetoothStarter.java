package com.xworkz.bluetoothstarter;

import com.xworkz.bluetooth.dto.BluetoothDTO;

public class BluetoothStarter {
	
	public static void main(String[] args) 
	{
	
     BluetoothDTO bluetoothDTO=new BluetoothDTO();
     bluetoothDTO.setBrand("boat");
     bluetoothDTO.setColour("black");
     bluetoothDTO.setMaxVolume(7);
     bluetoothDTO.setType("wired");
     bluetoothDTO.setDistanceCoverage(10);
     
     String brand=bluetoothDTO.getBrand();
     float distanceCoverage=bluetoothDTO.getDistanceCoverage();
     String colour=bluetoothDTO.getColour();
     String type=bluetoothDTO.getType();
     
     System.out.println(brand.concat(" ").concat(colour).concat(" ").concat(String.valueOf(bluetoothDTO.getMaxVolume()).concat(" ")) 
    .concat(" "). concat(type).concat(" ").concat(String.valueOf(bluetoothDTO.getDistanceCoverage()).concat(" ")));
    		 
    BluetoothDTO bluetoothDTO2=new BluetoothDTO("onePlus","black",7,"wireless",12);
    
    System.out.println(bluetoothDTO2.getBrand().concat(" ").concat(bluetoothDTO2.getColour()).concat(" ").concat(String.valueOf(bluetoothDTO2.getMaxVolume()).concat(" ")
   .concat(bluetoothDTO2.getType()).concat(" ").concat(String.valueOf(bluetoothDTO2.getDistanceCoverage())).concat(" ")));
    
    
}

}
