package com.xworkz.internet;
import com.xworkz.internet.AirtelInternet;
public class Browser {

	
	private  Internet internet;
	
	public Browser(Internet internet)
	{
		this.internet=internet;
	}
	
	public void errorInConnecting() {
		System.out.println("invoke error in connection");
		
	}
	
	public void changeInternet()
	{
		System.out.println("change internet to");
		
		{
			
		}
	}
	public void browse()
	{
		System.out.println("invoked  browse");
		
		int speed=internet.speed();
		boolean connect=internet.connect();
		
		if(speed>110 && (connect==true) ) 
		{
			
			System.out.println("can browse");
		}
		else
		{
			System.err.println("cannot connect");
			}
		
		
		
		if(connect==false)
		{
			this.errorInConnecting();
			this.changeInternet();
		}
		
		else
		{
			System.err.println("disconnect the browser");		}
		}
}

