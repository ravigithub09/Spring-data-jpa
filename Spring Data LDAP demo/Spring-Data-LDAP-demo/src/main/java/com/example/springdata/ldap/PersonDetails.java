package com.example.springdata.ldap;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {
	@Id
	@GeneratedValue
	private long personId;
	private String firstName,lastName,address;
	private Date dob;
	
	public PersonDetails() {
		System.out.println("PersonDetails.PersonDetails()");
	}
	

	public PersonDetails(long personId, String firstName, String lastName, String address, Date dob) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
	}


	public long getPersonId() {
		return personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public Date getDob() {
		return dob;
	}
	
}
