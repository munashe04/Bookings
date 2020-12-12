package com.client;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientDaoImpl implements ClientDao {
	
	private ClientDao clientDao ;
	
	
	@Override
	public int insertClient(String name, String surname) {

		return clientDao.insertClient(name, surname);
	}

	@Override
	public int pickDate(String fullName, Date date) {

		return  clientDao.pickDate(fullName, date) ;
	}

	@Override
	public int pickTime(String fullName, Time time) {
		return  clientDao.pickTime(fullName, time);
	}

	@Override
	public List<Client> allClients() {
	
		return clientDao.allClients();
	}

	@Override
	public Optional<Client> selectByfullName(String name) {

		return  clientDao.selectByfullName(name);
	}

	@Override
	public int addClient(String fullName) {

		return  clientDao.addClient(fullName);
	}

	@Override
	public int deleteByfullName(String fullName) {
	
		return  clientDao.deleteByfullName(fullName);
	}

	@Override
	public int updateByTime(Client client, Time time) {

		return  clientDao.updateByTime(client, time);
	}

	@Override
	public int updateByfullName(Client client, String fullName) {
		
		return  clientDao.updateByfullName(client, fullName);
	}

}