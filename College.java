package com.example.springbootcrudeoperation.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Branches")
	private int Branches;
	
	@Column(name="location")
	private String location;
	
	@Column(name="noofstudent")
	private int noofstudent;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getBranches() {
		return Branches;
	}

	public void setBranches(int branches) {
		Branches = branches;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoofstudent() {
		return noofstudent;
	}

	public void setNoofstudent(int noofstudent) {
		this.noofstudent = noofstudent;
	}
	
	

}
