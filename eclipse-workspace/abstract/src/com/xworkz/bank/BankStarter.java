package com.xworkz.bank;

import com.xworkz.bank.Bank;
import com.xworkz.bank.IciciBank;

public class BankStarter {
	
	public static void main(String[] args) {
	Bank bank=new IciciBank();
	bank.provideLoan();
	bank.openAccount();
	String obtain=bank.getName();
	System.out.println(obtain);
	String obtainIfsc=bank.getIfscCode();	
	System.out.println(obtainIfsc);

	Bank bank1=new HdfcBank("Hdfc","HDFC67890");
	bank1.provideLoan();
	bank1.openAccount();
	String obtainName=bank.getName();
	System.out.println(obtainName);
	String obtaining=bank.getIfscCode();	
	System.out.println(obtaining);

}
}
