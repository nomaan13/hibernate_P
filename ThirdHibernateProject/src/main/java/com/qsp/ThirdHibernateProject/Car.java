package com.qsp.ThirdHibernateProject;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car implements Serializable {

	@Id
	int id;
	String company;
	String color;
	double engine;
	@Column(name = "Release Year")
	LocalDate year;

	public Car() {
	}

	Car(int id, String company, String color, double engine, LocalDate year) {
		this.id = id;
		this.company = company;
		this.color = color;
		this.engine = engine;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public LocalDate getYear() {
		return year;
	}

	public void setYear(LocalDate year) {
		this.year = year;
	}

	@Override
	public String toString() {

		return "Car id : " + id + "\nCar Company : " + company + "\nCar Color : " + color + "\nCar Engine : " + engine
				+ "\nCar Release year : " + year;
	}
}
