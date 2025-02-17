package com.hcl.FifthHibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	private int id;

	@Column(name = "Nationality")
	private String country;

	@Column(name = "Passport_No.")
	private String passport_no;
	
	@OneToOne(mappedBy = "passport")
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Passport(int id, String country, String passport_no) {
		super();
		this.id = id;
		this.country = country;
		this.passport_no = passport_no;
	}

	public Passport() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(String passport_no) {
		this.passport_no = passport_no;
	}
	

}
