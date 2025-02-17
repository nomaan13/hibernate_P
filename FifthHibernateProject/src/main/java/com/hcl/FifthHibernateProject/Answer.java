package com.hcl.FifthHibernateProject;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@Column(name = "Ans_Id")
	private int ans_Id;
	
	@Column(name = "Answer") 
	private String ans;
	
	
	@OneToOne(mappedBy = "ans")
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		}

	public Answer(int ans_Id, String ans) {
		super();
		this.ans_Id = ans_Id;
		this.ans = ans;
	}

	public int getAns_Id() {
		return ans_Id;
	}

	public void setAns_Id(int ans_Id) {
		this.ans_Id = ans_Id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	
	
	
}
