package com.xworkz.first;

import com.xworkz.first.MedicineOperator;
public class MedicineStarter {
	public static void main(String[] args) {
		
		MedicineOperator operator=new MedicineOperator();
		
		operator.add("voricet");
		operator.add(null);
		
		operator.displayMedicineNames();
		
		operator.add("deflu");
		operator.add("omee");
		operator.add("dolo");
		operator.add("vicks");
		operator.add("strepsils");
		operator.displayMedicineNames();
		
	}

}
