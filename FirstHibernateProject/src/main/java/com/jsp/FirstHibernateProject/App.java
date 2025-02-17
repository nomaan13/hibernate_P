package com.jsp.FirstHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml")	;
        
        SessionFactory f1 = cfg.buildSessionFactory();
        
       Student s1 = new Student();
       s1.setId(104);
       s1.setName("Robb");
       s1.setCity("California");
       
      System.out.println(s1);
       Session session=f1.openSession();
       /*
        * 
        */
       session.beginTransaction();
       session.save(s1);
      
       session.getTransaction().commit();
       
       
       session.close();
       
    }
}
