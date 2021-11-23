package com.xworkz.indian.military;

import com.xworkz.military.army.IndianArmy;
import com.xworkz.military.army.MilitaryJoinRules;
import com.xworkz.military.army.PrarthanaJoinRules;

public class IndianArmyStarter{
	
	public static void main(String[] args)
	{
		MilitaryJoinRules militaryJoinRules=new PrarthanaJoinRules();
	IndianArmy army=new IndianArmy(militaryJoinRules);
	army.joinUs();
}
}