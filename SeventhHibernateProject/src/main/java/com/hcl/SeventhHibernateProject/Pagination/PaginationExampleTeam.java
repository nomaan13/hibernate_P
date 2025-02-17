package com.hcl.SeventhHibernateProject.Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hcl.SeventhHibernateProject.Cricket.IplTeams;
import com.hcl.SeventhHibernateProject.Cricket.Players;

public class PaginationExampleTeam {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Query<IplTeams> teams = session.createQuery("from IplTeams");

		teams.setFirstResult(0);
		teams.setMaxResults(3);

		List<IplTeams> list = teams.list();

		for (IplTeams t1 : list) {
			System.out.println(
					"Team Name : " + t1.getName() + "\nTotal Championship : " + t1.getCup() + "\n********Team Players******** ");

			for (Players p1 : t1.getPlayers()) {
				System.out.println("Player's name : " + p1.getName() + "\nPlayers Jersy-no : " + p1.getJersy()
						+ "\n________________________________________________");

			}
			System.out.println("=================================");
		}

		session.close();
		sf.close();
	}

}
