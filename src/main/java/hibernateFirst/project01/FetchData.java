package hibernateFirst.project01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernateFirst.project01.utility.HibernateUtiliti;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory =HibernateUtiliti.getSessionFactory();
		Session session =  sessionFactory.openSession();
	songs song= session.load(songs.class, 2);
	System.out.println(song);
	
	}

}
