package com.hcl.SeventhHibernateProject.Cricket;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class IplTeams {
	@Id
	private int id;
	@Column(name = "Team-name")
	private String name;
	@Column(name = "Champions")
	private int cup;
	
	@OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
	private List<Players> players ;

	public IplTeams() {
		super();}
	
	
	public IplTeams(int id, String name, int cup, List<Players> players) {
		super();
		this.id = id;
		this.name = name;
		this.cup = cup;
		this.players = players;
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
	public int getCup() {
		return cup;
	}
	public void setCup(int cup) {
		this.cup = cup;
	}
	public List<Players> getPlayers() {
		return players;
	}
	public void setPlayers(List<Players> players) {
		this.players = players;
	}
//	@Override
//	public String toString() {
//		return "IplTeams [id=" + id + ", name=" + name + ", cup=" + cup + ", players=" + players + "]";
//	}
	
	

	

	
	
}
