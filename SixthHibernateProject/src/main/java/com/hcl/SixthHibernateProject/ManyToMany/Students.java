package com.hcl.SixthHibernateProject.ManyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {

	@Id
	private int id;

	@Column(name = "Student-name")
	private String name;

	@ManyToMany
	@JoinTable(name = "Details",
	joinColumns = @JoinColumn(name = "Std-ID"),
	inverseJoinColumns = @JoinColumn(name = "Course-ID"))
	private List<Projects> projects;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public Students(int id, String name, List<Projects> projects) {
		super();
		this.id = id;
		this.name = name;
		this.projects = projects;
	}

}
