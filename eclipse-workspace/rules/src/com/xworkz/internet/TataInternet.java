package com.xworkz.internet;

public class TataInternet implements Internet {
	
	public TataInternet()
	{
		System.out.println("invoke tata internet");
	}

	@Override
	public boolean connect() {
		
		return false;
	}

	@Override
	public int speed() {
		
		return 100;
	}

	@Override
	public void disconnect() {
		
		
	}
	
	

}
