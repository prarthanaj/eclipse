package com.xworkz.browser;


	
	import com.xworkz.internet.Internet;
	import com.xworkz.internet.Browser;
	import com.xworkz.internet.AirtelInternet;
	import com.xworkz.internet.TataInternet;
	
	public class BrowserStarter {
		
		public static void main (String[] args)
		{
		Internet internet=new AirtelInternet();
			Browser browser=new Browser(internet);
			browser.browse();
			System.out.println("%%%%%%%%%%%%%%%%");
			
			Internet internet1=new TataInternet();
			Browser browser1=new Browser(internet1);
			browser1.browse();	
			
			
			
			
			
		}

	}



