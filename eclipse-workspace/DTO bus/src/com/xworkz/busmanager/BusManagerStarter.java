package com.xworkz.busmanager;

import com.xworkz.dto.busroute.BusRouteDTO;
import com.xworkz.dao.busroute.BusRouteDAO;
import com.xworkz.dao.busroute.BusRoutesDAO;

public class BusManagerStarter {
	
	public static void main(String[] args) {
	
	BusRouteDTO dto=new BusRouteDTO(46,"bdvt","cbt","xyz");
	BusRouteDAO dao=new BusRoutesDAO();
	BusManager manager=new BusManager(dao);
	manager.save(dto);
	manager.findByDestination(dto);
	manager.displayDetails();

}
}
