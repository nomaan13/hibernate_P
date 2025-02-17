package com.qsp.SecondHibernateProject;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Driver {

	public static void main(String[] args) {

		System.out.println("Hibernate start...........");

		Configuration cfg = new Configuration(); // HIBERNATE will activate here
		cfg.configure("hibernate.cfg.xml"); // Meta-Data of XML file will load in the memory

		SessionFactory s1 = cfg.buildSessionFactory();

		College c3 = new College();

		c3.setId(107);
		c3.setName("JMI");
		c3.setCity("Delhi");
		c3.setContact(990239021);
		c3.setYear(LocalDate.of(1900, 7, 5));
		
		System.out.println(c3);

		Session session = s1.openSession();

		session.beginTransaction();
		session.save(c3);

		session.getTransaction().commit();

		System.out.println("Hibernate is closing.............");
		session.close();

	}
}
