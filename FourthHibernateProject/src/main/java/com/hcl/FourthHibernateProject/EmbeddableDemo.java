package com.hcl.FourthHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbeddableDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration(); // Hibernate will activate here
		cfg.configure("hibernate.cfg.xml"); 	 // Here meta data of xml file will load in the memory

		SessionFactory s1 = cfg.buildSessionFactory();

		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();

		e1.setId(502);
		e1.setName("Johnson");

		Certificate crt = new Certificate();
		crt.setCourse("Java Development");
		crt.setDuration("6-Months");

		e1.setCertificate(crt);

		e2.setId(504);
		e2.setName("Warn");

		Certificate cft = new Certificate();
		cft.setCourse("Python Programming");
		cft.setDuration("4 Months");
		e2.setCertificate(cft);

		e3.setId(506);
		e3.setName("Beckhem");

		Certificate cft1 = new Certificate();
		cft1.setCourse("Web Development");
		cft1.setDuration("6 Months");
		e3.setCertificate(cft1);

		Session sess = s1.openSession();
		Transaction tx = sess.beginTransaction();

		sess.save(e1);
		sess.save(e2);
		sess.save(e3);

		tx.commit();
		sess.close();
		s1.close();

	}
}
