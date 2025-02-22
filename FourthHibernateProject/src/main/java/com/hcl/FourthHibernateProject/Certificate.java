package com.hcl.FourthHibernateProject;

import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {

	String course;

	String duration;

	public Certificate() {
		super();
	}

	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
