package com.hcl.SixthHibernateProject.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		System.out.println("Starting the hibernate.............");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Students s1 = new Students();
		Students s2 = new Students();

		s1.setId(33);
		s1.setName("Jamses");

		s2.setId(34);
		s2.setName("Pat");

		Projects p1 = new Projects();
		Projects p2 = new Projects();

		p1.setId(9910);
		p1.setName("Movieflix");

		p2.setId(9920);
		p2.setName("Chat-Application");

		List<Students> std = new ArrayList<Students>();
		List<Projects> pro = new ArrayList<Projects>();

		std.add(s1);
		std.add(s2);

		pro.add(p1);
		pro.add(p2);

		s1.setProjects(pro);
		p1.setStudents(std);

		Session session = sf.openSession();
		Transaction txt = session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(p1);
		session.save(p2);

		txt.commit();
		System.out.println("Closing the hibernate.............");
		session.close();
		sf.close();
	}

}
