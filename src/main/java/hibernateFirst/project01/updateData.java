package hibernateFirst.project01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernateFirst.project01.utility.HibernateUtiliti;

public class updateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory =HibernateUtiliti.getSessionFactory();
		if(sessionFactory!=null) {
		Session session =  sessionFactory.openSession();
		session.beginTransaction();
	songs song= session.get(songs.class, 4);
	System.out.println(song);
	
	song.setName("ab");
	song.setName("abc");
	song.setName("a");
	song.setArtils("Idddd");
	
	
	Session newSession = sessionFactory.openSession();
	newSession.beginTransaction();
	newSession.get(songs.class, 4);
	//newSession.update(song);
	newSession.merge(song);
	
	newSession.getTransaction().commit();
	
	session.close();
	
	
	
	}
	}

}
