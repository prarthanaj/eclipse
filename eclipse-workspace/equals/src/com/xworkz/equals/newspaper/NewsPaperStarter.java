package com.xworkz.equals.newspaper;

public class NewsPaperStarter {
	public static void main(String[] args)
	{
		
		
		 NewsPaper newspaper=new NewsPaper();
		 newspaper.setName("THE HINDU");
		 newspaper.setLang("english");
		 newspaper.setSince(1870);
	
	
		System.out.println(newspaper.toString());
		
		System.out.println(newspaper.hashCode());
		
		
		 NewsPaper newspaper2=new NewsPaper();
		 newspaper2.setName("THE HINDU");
		 newspaper2.setLang("English");
		 newspaper2.setSince(1870);
	
	
		System.out.println(newspaper2.toString());
		
		System.out.println(newspaper2.hashCode());
		
		
		if(newspaper==newspaper2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=newspaper.equals(newspaper2);
		System.out.println(same);
	}


}
