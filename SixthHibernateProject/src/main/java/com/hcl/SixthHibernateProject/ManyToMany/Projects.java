package com.hcl.SixthHibernateProject.ManyToMany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects {

	@Id
	private int id;

	@Column(name = "Project-name")
	private String name;

	@ManyToMany(mappedBy = "projects")
	private List<Students> students;

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projects(int id, String name, List<Students> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
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

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

}
