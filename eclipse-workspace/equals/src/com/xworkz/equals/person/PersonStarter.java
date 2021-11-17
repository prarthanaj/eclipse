package com.xworkz.equals.person;

public class PersonStarter {
	
	public static void main(String[] args)
	{
		Person person=new Person();
		person.setName("Prarthana");
		person.setEmail("prarthana@gmail.com");
		person.setCity("bdvt");
		
		Person person2=new Person();
		person.setName("nivya");
		person.setEmail("nivya@gmail.com");
		person.setCity("bdvt");
		
		if(person==person2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=person.equals(person);
		System.out.println(same);
	}
}
