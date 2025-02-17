package com.hcl.SixthHibernateProject.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hcl.SixthHibernateProject.Programmer;

public class Students {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tnx = session.beginTransaction();
		String q = "from Student";

		Query<Programmer> query = session.createQuery(q);

		List<Programmer> list = query.list();

		for (Programmer st : list) {
			System.out.println(st.getName() + " : " + st.getId());
		}

		tnx.commit();
		session.close();
		sf.close();
	}
}
