package com.hcl.SeventhHibernateProject.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hcl.SeventhHibernateProject.Cricket.Players;

public class SecondLevelCache {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session1 = sf.openSession();
		Players p1 = session1.get(Players.class, 202);
		System.out.println(p1.getName());

		session1.close();
		
		
		/**
		 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NOt WORKING!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * because Hibernate Core Dependency version and  Hibernate Ehcache Integration version 
		 * are not same 
		 * Which create issue in pom.xml file.......
		 */

		Session session2 = sf.openSession();

		session2.close();

		sf.close();
	}

}
