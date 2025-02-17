package com.hcl.SeventhHibernateProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hcl.SeventhHibernateProject.Cricket.IplTeams;
import com.hcl.SeventhHibernateProject.Cricket.Players;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate is starting................");
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		IplTeams team1 = new IplTeams();
		team1.setId(5);
		team1.setName("GT");
		team1.setCup(1);
		
		
		Players player1 =new Players();
		player1.setId(601);
		player1.setName("Subhman Gill");
		player1.setJersy(7);
		player1.setTeam(team1);
		
		Players player2 =new Players();
		player2.setId(602);
		player2.setName("Mohmmad Shami");
		player2.setJersy(11);
		player2.setTeam(team1);
		
		Players player3 =new Players();
		player3.setId(603);
		player3.setName("David Miller");
		player3.setJersy(10);
		player3.setTeam(team1);

		
				List<Players> list1 = new ArrayList<>();
		list1.add(player1);
		list1.add(player2);
		list1.add(player3);
		
		
		team1.setPlayers(list1); //Assigning multiple players to a single team 

		Session session =sf.openSession();
		session.save(team1);
	
		Transaction tnx = session.beginTransaction();

		System.out.println("Hibernate is closing................");
		tnx.commit();
		session.clear();
		sf.close();
	}
}
