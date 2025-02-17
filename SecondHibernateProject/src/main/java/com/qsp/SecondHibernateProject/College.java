package com.qsp.SecondHibernateProject;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@SuppressWarnings("serial")
@Entity // Treat this class as a Table/Entity
public class College implements Serializable {

	@Id
	@Column(name = "Id")
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Address")
	private String city;

	@Column(name = "Phone no.")
	private long contact;

	@Column(name = "Start")
	private LocalDate year;

	public College() {
	}

	public College(int id, String name, String city, long contact, LocalDate year) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.contact = contact;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}

	@Override
	public String toString() {

		return "College Id : " + id + "\nCollege-Name : " + name + "\nCollege-City " + city + "\nCollege-Contact : " + contact
				+ "\nCollege Opening year : " + year;
	}

}
