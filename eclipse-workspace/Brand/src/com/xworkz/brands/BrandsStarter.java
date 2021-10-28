package com.xworkz.brands;

import com.xworkz.brands.BrandsOperator;


public class BrandsStarter {
	
	public static void main(String[] args) {
	BrandsOperator operator=new BrandsOperator();
		
		operator.add("acer");
		operator.add(null);
		
		operator.displayBrandNames();
		
		operator.add("HP");
		operator.add("dell");
		operator.add("compac");
		operator.add("toshiba");
		operator.add("lenovo");
		operator.displayBrandNames();
		
	}
				
}
