package com.xworkz.compiles;
import com.xworkz.compile.event.AmazonPrime;
import com.xworkz.compile.exception.NotaPrimeMemberException;

public class AmazonPrimeStarter {

	public static void main(String[] args) throws NotaPrimeMemberException
	 {
		 AmazonPrime amazon=new AmazonPrime();
		 amazon.primeMember("INDIA",true);
		 System.out.println("event created");
	 }
		
}
