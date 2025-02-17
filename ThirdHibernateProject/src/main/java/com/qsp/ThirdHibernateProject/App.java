package com.qsp.ThirdHibernateProject;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Start..........." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory s1 = cfg.buildSessionFactory();
        
        
        Car c2 = new Car(953, "Maruti", "Blue", 1.4, LocalDate.of(2008,9,17));
        Car c3 = new Car(924, "Skoda", "White", 1.6, LocalDate.of(2010,6,20));
        Car c4 = new Car(915, "BMW", "Black", 2.8, LocalDate.of(2018,6,1));
        Car c5 = new Car(906, "Audi", "Grey", 1.8, LocalDate.of(2016,3,1));
        Car c6 = new Car(909, "Ferrari", "Yellow", 3.0, LocalDate.of(2023,10,30));
        
        System.out.println();
         
        Session session =s1.openSession();
        session.beginTransaction();
        session.save(c2);
       
        session.getTransaction().commit();
        
        
        System.out.println("Hibernate is close...");
        session.close();
        
    }
}
