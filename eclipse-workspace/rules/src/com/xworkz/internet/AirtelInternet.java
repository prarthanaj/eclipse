package com.xworkz.internet;

public class AirtelInternet implements Internet {
	
	public AirtelInternet() {
		System.out.println("invoked airtel internet");
	}

	@Override
	public boolean connect() {
		
		return true;
	}

	@Override
	public int speed() {
		
		return 135;
	}

	@Override
	public void disconnect() {
		
		
	}
	
	

}
