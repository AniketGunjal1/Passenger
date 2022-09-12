package com.passenger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class passangerController {
	
	@GetMapping("/getSinglePassanger")
	public Passenger getPassenger() {
		return new Passenger(1,"Raj",20,"Pune","Mumbai");
	}
	
	@GetMapping("/getAllPassengers")
	public List<Passenger> getpasList(){
		List<Passenger> paslist= new ArrayList<>(); 
		paslist.add(new Passenger(1,"Raj",20,"Pune","Mumbai"));
		paslist.add(new Passenger(2,"Sumit",21,"Mumbai","Pune"));
		paslist.add(new Passenger(3,"Ranjan",22,"Pune","Bhopal"));
		paslist.add(new Passenger(4,"Rashmi",23,"Bhopal","Delhi"));
		paslist.add(new Passenger(5,"Priya",24,"Pune","Goa"));
		paslist.add(new Passenger(6,"Arti",22,"Nashik","Mumbai"));
		paslist.add(new Passenger(7,"Nilesh",25,"Gujrat","Banglore"));
		paslist.add(new Passenger(8,"Rakesh",26,"Pune","Mumbai"));
		paslist.add(new Passenger(9,"Sam",27,"Pune","Mumbai"));
		paslist.add(new Passenger(10,"Sushmita",28,"Haryana","Delhi"));
		
		return paslist;
			
		
		
	}

}
