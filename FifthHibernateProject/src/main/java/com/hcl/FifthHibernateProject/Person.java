package com.hcl.FifthHibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int id;

	@Column(name = "Passport_Holder_Name")
	private String personName;

	@OneToOne
	private Passport passport;

	public Person() {
		super();
	}

	public Person(int id, String personName, Passport passport) {
		super();
		this.id = id;
		this.personName = personName;
		this.passport = passport;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
