package com.client;

import java.sql.Time;
import java.time.*;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	private int id;
	private String name;
	private String surname;
	private Date date;
	private Time time;
	
	private String fullName = name +" "+ surname;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	};
	
	
	public Client(String name, String surname, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	public Client() {}
	
	
	

}
