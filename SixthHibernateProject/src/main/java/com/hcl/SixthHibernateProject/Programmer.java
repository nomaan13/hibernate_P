package com.hcl.SixthHibernateProject;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Programmer {

	@Id
	private int id;
	
	private String name;
	@Column(name = "Programming-Lanuage")
	private String language;
	
	
	@OneToMany(mappedBy = "programmer")
	private List<Laptop> laptop;


	public Programmer() {
		super();
	}


	public Programmer(int id, String name, String language, List<Laptop> laptop) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.laptop = laptop;
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


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public List<Laptop> getLaptop() {
		return laptop;
	}


	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	
	
	
	
	
	
}
