package com.client;

import java.util.List;
import java.util.Optional;
import java.sql.Date;
import java.sql.Time;



import org.springframework.stereotype.Component;

@Component
public interface ClientDao {
	
	public class ClientDaoImpl {

	}

	int insertClient(String name,String surname);
	
	int pickDate(String fullName,Date date);
	
	int pickTime(String fullName, Time time);
	
	List<Client>allClients();
	
	Optional<Client>selectByfullName(String name);
	
	int addClient(String fullName);
	
	int deleteByfullName(String fullName);
	
	int updateByTime(Client client,Time time);
	
	int updateByfullName(Client client, String fullName);
	
	
	
	
	

}
