package com.xworkz.wardrobeoperation;


public class WardrobeOperator {
	public static void main(String[] args)
	{
		Wardrobe wardrobeConsidered=new Wardrobe();
		
		wardrobeConsidered.add(null);
		wardrobeConsidered.add("pants");
		wardrobeConsidered.add("churidhar");
	    wardrobeConsidered.add("t-shirts");
	    wardrobeConsidered.add(null);
	    wardrobeConsidered.add("kurthis");
	    
	    boolean res1=wardrobeConsidered.add("duppatta");
	    if(res1)
	    {
	    	System.out.println("add is succeeded");
	    }
	    else
	    {
	    	System.out.println("add is not succeeded");
	    }
	    
	    wardrobeConsidered.displayDress();
	    
	    wardrobeConsidered.update(4, "sweatshirt");
	    boolean res2=wardrobeConsidered.update(4,"sweatshirt");
	    if(res2)
	    {
	    	System.out.println("update is succeeded");
	    }
	    else
	    {
	    	System.out.println("update did not succeed");
	    }
	    
	    boolean res3=wardrobeConsidered.match("sweatshirt");
	    if(res3)
	    {
	    	System.out.println("match found");
	    }
	    else
	    {
	    	System.out.println("match not found");
	    }
	    	
	    boolean res4=wardrobeConsidered.delete(3);
	    if(res4)
	    {
	    	System.out.println("delete was success");
	    }
	    else
	    {
	    	System.out.println("dlt was not success");
	    }
	    
	    wardrobeConsidered.displayDress();
	    

	    boolean res5=wardrobeConsidered.firstletter("s");
	    if(res5)
	    {
	    	System.out.println("match for first letter found");
	    }
	    else
	    {
	    	System.out.println("match for first letter not found");
	    }
	    
	    boolean res6=wardrobeConsidered.lastletter("y");
	    if(res6)
	    {
	    	System.out.println("match for last letter found");
	    }
	    else
	    {
	    	System.out.println("match for last letter not found");
	    }
	    
}
}
