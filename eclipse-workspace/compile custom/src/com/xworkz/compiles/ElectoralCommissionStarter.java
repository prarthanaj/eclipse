package com.xworkz.compiles;
import com.xworkz.compile.event.ElectoralCommission;
import com.xworkz.compile.exception.CanVote;

public class ElectoralCommissionStarter {
 public static void main(String[] args) throws CanVote
 {
	 ElectoralCommission electoralCommission =new ElectoralCommission();
	 electoralCommission.electoralCommissionForVote("P",22);
	 System.out.println("event created");
 }
	
	
}
