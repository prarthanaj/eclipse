package com.xworkz.compile.event;

import com.xworkz.compile.exception.CashLessException;

public class MedicalInsurance {
	
public void cashLessExpense(String name,double totalHoursIn ) throws CashLessException	
	{
		
		if(name!=null && name.length()>2 && name.length()<26 && totalHoursIn >24)
		{
			System.out.println("can have cash less");
		}
		else {
			System.err.println("cannot get");
			throw new CashLessException();
			
		}
		
		
		}
		

}
