package com.xworkz.bank;

public class HdfcBank extends Bank{
	
	public HdfcBank(String name,String ifscCode) {
		super("HDFC", "HDFC7890");
		
	}

	@Override
	public void provideLoan() {
	System.out.println("loan invoked")	;
		
	}

	@Override
	public void openAccount() {
		System.out.println(" open account invoked");
		
	}

}
