package com.hcl.SeventhHibernateProject.Cricket;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Players {

	@Id
	private int id;
	@Column(name = "Player-name")
	private String name;
	@Column(name="Jersy-no.")
	private int jersy;
	
	@ManyToOne
	@JoinColumn(name = "Team-Id")
	private IplTeams team ;

	public Players(int id, String name, int jersy, IplTeams team) {
		super();
		this.id = id;
		this.name = name;
		this.jersy = jersy;
		this.team = team;
	}

	public Players() {
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

	public int getJersy() {
		return jersy;
	}

	public void setJersy(int jersy) {
		this.jersy = jersy;
	}

	public IplTeams getTeam() {
		return team;
	}

	public void setTeam(IplTeams team) {
		this.team = team;
	}

	
	
	
	
	
	
}
