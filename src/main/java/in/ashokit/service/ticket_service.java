package in.ashokit.service;

import java.util.Collection;


import in.ashokit.bindingforms.passenger;
import in.ashokit.bindingforms.ticket;

public interface ticket_service {

	public ticket bookticket(passenger p); 
	
	public Collection<ticket> getalltickets();
}
