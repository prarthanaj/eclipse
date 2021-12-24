package com.xworkz.array;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.lang.String;

public class Xworkz {

	public static void main(String[] args) {
	
		List<String> listofStates=new ArrayList<String>();
		
		listofStates.add("Karnataka");
		listofStates.add("tamil nadu");
		listofStates.add("Kerla");
		listofStates.add("Andhra");
		listofStates.add("tamil nadu");
		listofStates.add("tamil nadu");
		System.out.println(listofStates);
		
		Set<String> listofStates1=new LinkedHashSet<String>();
		listofStates1.add("Karnataka");
		listofStates1.add("tamil nadu");
		listofStates1.add("Kerla");
		listofStates1.add("Kerla");
		listofStates1.add("Andhra");
		listofStates1.add("tamil nadu");
		listofStates1.add("tamil nadu");
		listofStates1.add("tamil nadu");
		
		System.out.println(listofStates1);
		
		String s="a b c d efg hij klm n o";
		Set<String> container = new LinkedHashSet<String>();
		String[] splitWords=s.split(" ");
		for(String letter: splitWords)
		{
			System.out.println(letter);
			container.add(letter);
			
		}
		System.out.println("end of linked hash");
		System.out.println("######################");
		Iterator<String>iterator=container.iterator();
		while(iterator.hasNext())
		{
			String string=iterator.next();
			System.out.println(string);
		}
		
		System.out.println("#################");
		
		String lowerCaseLetter="qweQWERABef";
		Set<String> container1=new LinkedHashSet<String>();
		//String[] splitalpha=lowerCaseLetter.split(" ");
		for( int i=0; i<lowerCaseLetter.length();i++)
		{
			
				if(Character.isUpperCase(lowerCaseLetter.charAt(i)))
				{
					
					System.out.println(lowerCaseLetter.charAt(i));
					
				}
	}
		System.out.println("printing lower case letters");
	for( int i=0; i<lowerCaseLetter.length();i++)
	{
		
			if(Character.isLowerCase(lowerCaseLetter.charAt(i)))
			{
				
				System.out.println(lowerCaseLetter.charAt(i));
				
			}
}}
	
	
	

}
