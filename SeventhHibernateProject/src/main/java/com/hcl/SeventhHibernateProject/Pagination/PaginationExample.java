package com.hcl.SeventhHibernateProject.Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hcl.SeventhHibernateProject.Cricket.Players;

public class PaginationExample {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Query<Players> query = session.createQuery("From Players");

		query.setFirstResult(10);
		query.setMaxResults(5);

		List<Players> playerList = query.list();

		for (Players players : playerList) {
			System.out.println("Player Id : " + players.getId() + "\nPlayer's Name :" + players.getName()
					+ "\nPlayers's Team : " + players.getTeam().getName() + "\n=========================");
		}

		session.close();
		sf.close();

	}

}
