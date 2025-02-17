package com.hcl.SixthHibernateProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Hibernate is starting .......");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Programmer p1 = new Programmer();
		p1.setId(404);
		p1.setName("Robert");
		p1.setLanguage("Python");

		Laptop lap1 = new Laptop();
		lap1.setId(1011);
		lap1.setComp("Samsung");
		lap1.setProgrammer(p1);

		Laptop lap2 = new Laptop();
		lap2.setId(1012);
		lap2.setComp("HP");
		lap2.setProgrammer(p1);

		Laptop lap3 = new Laptop();
		lap3.setId(1013);
		lap3.setComp("Lenevo");
		lap3.setProgrammer(p1);

		List<Laptop> laptop_list = new ArrayList<>();
		laptop_list.add(lap1);
		laptop_list.add(lap2);
		laptop_list.add(lap3);

		p1.setLaptop(laptop_list);

		Session session = sf.openSession();
		Transaction txt = session.beginTransaction();

		session.save(p1);
		session.save(lap1);
		session.save(lap2);
		session.save(lap3);

		txt.commit();
		System.out.println("Hibernate is Closing .......");
		session.close();
		sf.close();
	}
}
