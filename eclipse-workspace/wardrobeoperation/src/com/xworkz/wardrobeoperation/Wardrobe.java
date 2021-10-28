package com.xworkz.wardrobeoperation;

public class Wardrobe {
 private String[] wardrobe=new String[6];
 private int cloth=0;
 
 public boolean add (String newDress) 
 {
	 if(newDress!=null && cloth<this.wardrobe.length)
	 {
		 this.wardrobe[cloth]=newDress;
		 System.out.println("added".concat(newDress));
		 this.cloth++;
		 return true;
	 }
	 else
	 {
		 System.out.println("newdress cannot be null or wardrobe is full ");
	 }
	 return false;
 }
 
 public boolean update(int index,String changeDress)
 {
	 if(index>=0 &&changeDress!=null && index<this.wardrobe.length)
	 {	
		 this.wardrobe[index]=changeDress;
		 System.out.println("changed dress".concat(changeDress));
		 return true;
	 }
	 else
	 {
		 System.out.println("index should be less then length or the dress changed cannot be null");
	 }
	 return false;
 }
 
 public boolean match(String dress)
	{
		for(int index=0;index<this.wardrobe.length;index++)
		{
			if(this.wardrobe[index]!=null)
			{
				if(this.wardrobe.equals(dress))
				{
					System.out.println("match found ".concat(dress));
					return true;
				}	
			}
		}
		return false;
	}
 
 public boolean delete(int index)
 {
	 if(index>=0 && index<this.wardrobe.length)
	 {
		 String remove=this.wardrobe[index];
				 this.wardrobe[index]=null;
		 System.out.println("removed".concat(remove));
		 return true;
	 }
	 else
	 {
		 System.out.println("conditipn not satisfied ");
	 }
	 return false;

 }
 
 public boolean firstletter(String sh)
 {
	 for(int index= 0;index<this.wardrobe.length;index++)
	 {
		 String check=this.wardrobe[index];
				 if(check!=null)
				 {
					 System.out.println("found dress with start sh");
					 return true;
				 }
				
	 }
	 return false;
	 
 }
 public boolean lastletter(String rt)
 {
	 for(int index= 0;index<this.wardrobe.length;index++)
	 {
		 String check1=this.wardrobe[index];
				 if(check1!=null)
				 {
					 System.out.println("found dress with start rt");
					 return true;
				 }
				
	 }
	 return false;
 }
	 
	 public void displayDress()
	 {
		 System.out.println("invoke display");
		 for(int index=0;index<this.wardrobe.length;index++)
		 {
			 System.out.println(this.wardrobe[index]);
		 }
	 }
	 
 }
 
 
 
 

