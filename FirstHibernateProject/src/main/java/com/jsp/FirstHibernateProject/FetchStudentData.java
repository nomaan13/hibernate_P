package com.jsp.FirstHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchStudentData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration(); // => Hibernate will activate here
		cfg.configure("hibernate.cfg.xml"); // => Here meta data of XML file will load in memory.
		SessionFactory f2 = cfg.buildSessionFactory(); // => Session factory object will be created here

		Session session = f2.openSession();

		Student std = (Student) session.load(Student.class, 103);
		System.out.println(std);

		session.close();
		f2.close();
	}

}
