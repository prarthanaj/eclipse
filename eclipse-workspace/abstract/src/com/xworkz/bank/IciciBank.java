package com.xworkz.bank;

public class IciciBank extends Bank {

	

	public IciciBank() {
		super("icici", "icici7890");
		
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
	

