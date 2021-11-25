package com.xworkz.dao.busroute;

import com.xworkz.dto.busroute.BusRouteDTO;
public class BusRoutesDAO implements BusRouteDAO {
	
	private BusRouteDTO dto;
	private BusRouteDAO dao;
	
	private BusRouteDTO[] busdto=new BusRouteDTO[8];
	private int count=4;
	
	public BusRoutesDAO() {
		System.out.println("invoke no arg const");
		
	}

	@Override
	public boolean save(BusRouteDTO dto) {
		if(dto!=null && this.count<this.busdto.length) {
			this.busdto[count]=dto;
			System.out.println(dto.getId());
			System.out.println(dto.getDestination());
			System.out.println(dto.getDriverName());
			System.out.println(dto.getStartPoint());
			this.count++;
		}
		System.out.println("invoke save from bus route dto");
		dao.save(dto);
		return true;
	}

	@Override
	public BusRouteDTO findByDestination(String destination) {
		System.out.println("invoke find by destination from bus route dto");
		if(destination!=null)
		{
			System.out.println("destination is not null");
		}
		for(int cat=0;cat<busdto.length;cat++) {
			BusRouteDTO dtoref=busdto[cat];
			if(dtoref!=null) {
				String name=dto.getDestination();
				if(name!=null)
				{
					return dtoref;
				}
			}
		}
		return null;
	}

	@Override
	public void displayDetails() {
	System.out.println("invoke display details");
	for(int cat=0;cat<busdto.length;cat++) {
		
	
	if(dto!=null)
	{
		System.out.println(dto.getId());
		System.out.println(dto.getDestination());
		System.out.println(dto.getDriverName());
		System.out.println(dto.getStartPoint());
		
	}
	else {
		System.err.println("dto is null");
	}
		
	}
	}
	

}
