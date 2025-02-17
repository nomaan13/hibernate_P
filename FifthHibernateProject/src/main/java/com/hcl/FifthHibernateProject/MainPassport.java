package com.hcl.FifthHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainPassport {

	public static void main(String[] args) {

		System.out.println("Starting the hibernate.............");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Person p1 = new Person();
		p1.setId(107);
		p1.setPersonName("Xavi");

		Passport pass1 = new Passport();
		pass1.setId(9007);
		pass1.setCountry("Spain");
		pass1.setPassport_no("ESP1995PX1017");
		pass1.setPerson(p1);

		p1.setPassport(pass1);

		Session session = sf.openSession();
		Transaction txt = session.beginTransaction();
		session.save(p1);
		session.save(pass1);

		txt.commit();
		System.out.println("Hibernate is closing..............");
		session.close();
		sf.close();
	}
}
