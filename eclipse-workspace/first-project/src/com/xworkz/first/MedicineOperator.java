package com.xworkz.first;

public class MedicineOperator {

	private String[] container=new String[5];
	private int count=0;
	
	public MedicineOperator() {
		System.out.println("invoked no arg const");
	}
	
	public void add(String medicineName) 
	{
		System.out.println("invoked add");
		
		if(medicineName!=null && this.count<this.container.length)
		{
			this.container[count]=medicineName;
			count++;
			System.out.println("Added medicine".concat(medicineName));
		}
		else {
			System.err.println(" medicine name cannot be null");
		}
	}
	public void displayMedicineNames()
	{
		System.out.println("invoked displayMedicineNames");
		for(int tablet=0;tablet<this.container.length;tablet++)
		{
			String ref=this.container[tablet];
			System.out.println(ref);
			
		}
	}
}
