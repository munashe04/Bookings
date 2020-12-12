package com.client;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/clients")
public class ClientContoller {
	
    @Autowired
	private final ClientDaoImpl clientDaoImpl;
    
	@Autowired
	public ClientContoller(ClientDaoImpl clientDaoImpl) {
		this.clientDaoImpl = clientDaoImpl;
	}
	
	@GetMapping
	public List<Client>allClients(){
		return clientDaoImpl.allClients();
	}
	
	@GetMapping(path = "{fullName}")
	public Optional<Client>selectByFullName(@PathVariable("fullName") String fullName){
		return clientDaoImpl.selectByfullName(fullName);
	}
	
	@PostMapping
	public int addClient(@RequestBody String fullName ) {
		return clientDaoImpl.addClient(fullName);
	}
	@DeleteMapping(path = "{fullName}")
	public int deletebyFullName(@PathVariable("fullName")String fullName) {
		return clientDaoImpl.deleteByfullName(fullName);
	}
	
	@PutMapping(path = "{fullName}")
	public int updateByFullName(@RequestBody Client client,@PathVariable("fullName")String fullName) {
		return  clientDaoImpl.updateByfullName(client, fullName);
	}
	@PutMapping(path = "{time}")
	public int updateByTime(@RequestBody Client client,@PathVariable("time")Time time) {
		return  clientDaoImpl.updateByTime(client, time);
	}

	@GetMapping(path = "{time}")
	public int pickTime (@PathVariable("time")Time time, String fullName){
		return clientDaoImpl.pickTime(fullName, time);
	}
	@GetMapping(path = "{date}")
	public int pickDate (String fullName ,@PathVariable("date")Date date){
		return clientDaoImpl.pickDate(fullName,date);
	
	}
	
}
