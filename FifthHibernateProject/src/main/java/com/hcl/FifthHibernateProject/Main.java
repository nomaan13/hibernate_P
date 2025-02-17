package com.hcl.FifthHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Hibernate is starting...........");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

//===============================================================================================        
		// Create object of Question

		Question q1 = new Question();
		q1.setQuestion_Id(107);
		q1.setQue("What is Persistance class? ");

		// Creating object of Answer
		Answer ans1 = new Answer();
		ans1.setAns_Id(701);
		ans1.setAns("Persistance class is that class whose object can be stored in databse");
		ans1.setQuestion(q1);

		q1.setAns(ans1);
//===============================================================================================		
// Create object of Question

		Question q2 = new Question();
		q2.setQuestion_Id(1109);
		q2.setQue("What is JSP ? ");

		// Creating object of Answer
		Answer ans2 = new Answer();
		ans2.setAns_Id(9011);
		ans2.setAns("JSP is a Server side technology which is usde to create dynamic web pages");
		ans2.setQuestion(q2);

		q2.setAns(ans2);
//===============================================================================================		
		// Create object of Question

		Question q3 = new Question();
		q3.setQuestion_Id(203);
		q3.setQue("What are four pillers of OOPs ? ");

		// Creating object of Answer
		Answer ans3 = new Answer();
		ans3.setAns_Id(302);
		ans3.setAns("Four pillers of OOPs are 1.Inheritance 2.Polymorphism 3.Encapsulation 4.Abstraction");
		ans3.setQuestion(q3);

		q3.setAns(ans3);
//===============================================================================================
		// OpenSession for saving the details
		Session session = sf.openSession();

		// Start the transaction
		Transaction txt = session.beginTransaction();

		// Now save the session
		session.save(q1);
		session.save(q2);
		session.save(q3);

		session.save(ans1);
		session.save(ans2);
		session.save(ans3);

		txt.commit();

		Question myQ = (Question) session.get(Question.class, 203);
		System.out.println(myQ.getQue());
		System.out.println(myQ.getAns().getAns());

		System.out.println("Hibernate is closing.........");
		session.close();
		sf.close();
	}
}
