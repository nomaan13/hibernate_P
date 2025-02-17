package com.hcl.FifthHibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "Q_Id")
	private int question_Id;

	@Column(name = "Question")
	private String Que;
	
	@OneToOne
	@JoinColumn(name="A_Id")
	private Answer ans ;

	public Question() {
	}

	public Question(int question_Id, String que) {
		super();
		this.question_Id = question_Id;
		Que = que;
	}

	public int getQuestion_Id() {
		return question_Id;
	}

	public void setQuestion_Id(int question_Id) {
		this.question_Id = question_Id;
	}

	public String getQue() {
		return Que;
	}

	public void setQue(String que) {
		Que = que;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

}
