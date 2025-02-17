package com.hcl.SeventhHibernateProject.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.SeventhHibernateProject.Cricket.Players;

public class FirstLevelCaching {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Players p1 = session.get(Players.class, 202);
		System.out.println(p1.getName());

		System.out.println("Complete another work.............");

		Players p2 = session.get(Players.class, 202);
		System.out.println(p2.getName());

		System.out.println(session.contains(p2));

		session.close();
		sf.close();
	}

}
