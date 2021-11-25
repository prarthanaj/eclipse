package com.xworkz.busmanager;

import com.xworkz.dto.busroute.BusRouteDTO;
import com.xworkz.dao.busroute.BusRouteDAO;

public class BusManager {
	
	BusRouteDAO dao;
	BusRouteDTO dto;
	
	public BusManager(BusRouteDAO dao) {
		this.dao=dao;
	}
	
	public void save(BusRouteDTO dto) {
		if(dto!=null) {
			boolean saved=dao.save(dto);
			if(saved) {
				System.out.println("invoke save method ");
			}
			else {
				System.err.println("not saving ");
			}
			
		}
		else {
			System.err.println("passed is null");
		}
		
		
}
	public void findByDestination(BusRouteDTO dto) {
		if(dto!=null)
		{
			BusRouteDTO dtoref=dao.findByDestination(dto.getDestination());
			if(dtoref!=null) {
				System.out.println(dtoref.getDestination());
			}
			else {
				System.err.println("passed null ref");
			}
			
			
		}
	}
	
	public void displayDetails() {
		if(dao!=null) {
			dao.displayDetails();
		}
	}
}