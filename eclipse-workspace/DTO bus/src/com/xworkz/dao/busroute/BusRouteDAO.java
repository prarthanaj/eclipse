package com.xworkz.dao.busroute;

import com.xworkz.dto.busroute.BusRouteDTO;

public interface BusRouteDAO {
	
	boolean save(BusRouteDTO dto);
	BusRouteDTO findByDestination(String destination);
	void displayDetails();
	
}
