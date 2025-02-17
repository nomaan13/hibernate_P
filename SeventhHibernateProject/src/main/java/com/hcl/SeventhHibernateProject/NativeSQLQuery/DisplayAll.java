package com.hcl.SeventhHibernateProject.NativeSQLQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class DisplayAll {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		String query = "SELECT * FROM PLAYERS";

		NativeQuery nq = session.createNativeQuery(query);
		List<Object[]> list = nq.list();

		for (Object[] p1 : list) {
			System.out.println(p1[2] + " = " + p1[3]);
		}

		session.close();
		sf.close();
	}

}
