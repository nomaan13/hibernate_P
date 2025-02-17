package com.hcl.SixthHibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int id;
	@Column(name = "Brand")
	private String comp;

	@ManyToOne
	@JoinColumn(name = "Programmer_ID")
	private Programmer programmer;

	public Laptop() {
		super();
	}

	public Laptop(int id, String comp, Programmer programmer) {
		super();
		this.id = id;
		this.comp = comp;
		this.programmer = programmer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public Programmer getProgrammer() {
		return programmer;
	}

	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}

}
