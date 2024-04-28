package in.ashokit.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import in.ashokit.bindingforms.passenger;
import in.ashokit.bindingforms.ticket;

@Service
public class ticket_service_impl implements ticket_service {

	Map<Integer, ticket> db = new HashMap<>();
	
	@Override
	public ticket bookticket(passenger p) {
	
		ticket t = new ticket();
		Random r = new Random();
		int id = r.nextInt(5);
		t.setTicket_num(id);
		
		BeanUtils.copyProperties(p,t);
		
		t.setStatus("confirmed");
		
		db.put(id, t);
		
		return t;
	}
	
	@Override
	public Collection<ticket> getalltickets(){
		
		return db.values();
	}
}
