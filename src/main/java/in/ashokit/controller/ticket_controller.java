package in.ashokit.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindingforms.passenger;
import in.ashokit.bindingforms.ticket;
import in.ashokit.service.ticket_service;

@RestController
public class ticket_controller {

	@Autowired
	private ticket_service service;
	
	@PostMapping("/ticket")
	public ResponseEntity<ticket> bookticket(@RequestBody passenger p){
		
		ticket tckt= service.bookticket(p);
		
		return new ResponseEntity<>(tckt,HttpStatus.CREATED);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<ticket>> getalltickets(){
		Collection<ticket> alltickets= service.getalltickets();
		return new ResponseEntity<>(alltickets,HttpStatus.OK);
	}
	
}
