package com.example.demo;

import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
@Entity
@Table(name = "EMPLOYEE")
public class Employee{
	@Column(name="id", length = 3, nullable=false)
	private long id;
	@Column(name="name", length = 120, nullable=false)
	private String name;
	@Column(name="wage", length = 10, nullable=false)
	private long wage;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public Long getWage() {
		return wage;
	}
	public void setWage(Long wage) {
		this.wage=wage;
	}
	
}
