package com.xworkz.compiles;
import com.xworkz.compile.event.MedicalInsurance;
import com.xworkz.compile.exception.CashLessException;
public class MedicalInsuranceStarter {
	
	public static void main(String[] args) throws CashLessException
	 {
		MedicalInsurance insurance=new MedicalInsurance();
		insurance.cashLessExpense("PR",24);
	    System.out.println("event created");
	 }
		
}
