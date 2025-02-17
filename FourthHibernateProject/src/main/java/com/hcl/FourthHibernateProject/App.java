package com.hcl.FourthHibernateProject;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate is starting............");

		Configuration cfg = new Configuration();		//Hibernate will activate here
		cfg.configure("hibernate.cfg.xml");				//Here meta data of xml file will load in the memory
		
		SessionFactory s1 = cfg.buildSessionFactory();

		Employ emp = new Employ();
		emp.setId(230);
		emp.setName("Jim CArry");
		
		System.out.println(emp);
		
		Session session = s1.openSession();
		
		session.beginTransaction();
		session.save(emp);

		session.getTransaction().commit();

		System.out.println("Hibernate is closing.............");
		session.close();

	}
}
