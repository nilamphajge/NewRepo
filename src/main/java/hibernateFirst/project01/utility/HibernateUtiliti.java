package hibernateFirst.project01.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernateFirst.project01.songs;

public class HibernateUtiliti {
private static SessionFactory sessionFactory = null;
	public static SessionFactory getSessionFactory() {
		try {
			if(sessionFactory==null)
			{
				
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(songs.class);
		 sessionFactory = configuration.buildSessionFactory();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("session factory object not created bcz of some issue");
			// TODO: handle exception
		}
		
		
		return sessionFactory;
	}
}
