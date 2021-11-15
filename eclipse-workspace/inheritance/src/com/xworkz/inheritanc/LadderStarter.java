package com.xworkz.inheritanc;

import com.xworkz.inheritance.ladder.Ladder;
import com.xworkz.inheritance.ladder.BatlaLadder;

public class LadderStarter {
	
	public static void main(String[] args)
	{
		Ladder ladder=new Ladder();
		System.out.println("************");
		System.out.println(ladder.toString());
		System.out.println(ladder);
		System.out.println(ladder.hashCode());
		ladder.lift();
		
		Ladder batlaLadder=new BatlaLadder();
		System.out.println("  ^^^^^^^^^^  ");
		System.out.println(batlaLadder.toString());
		System.out.println(batlaLadder);
		System.out.println(batlaLadder.hashCode());
		batlaLadder.lift();
		batlaLadder.fold();
		
	}
}
