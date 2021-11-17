package com.xworkz.equals.sock;

public class SockStarter {
	
	public static void main(String[] args)
	{
		
		
		Sock sock=new Sock();
		SockBrands brands=SockBrands.NIKE;
		SockType types=SockType.ANKLE;	
	    sock.setSize('s');
		sock.setPrice(700);
		
	
		System.out.println(sock.toString());
		
		System.out.println(sock.hashCode());
		
		Sock sock2=new Sock();
		
	    sock2.setSize('m');
		sock2.setPrice(700);
		
	
		System.out.println(sock2.toString());
		
		System.out.println(sock2.hashCode());
		
		
	
		
		if(sock==sock2)
		{
			System.out.println("both pointing to same memory");
		}
		
		boolean same=sock.equals(sock2);
		System.out.println(same);
	}

}
