package hibernateFirst.project01.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernateFirst.project01.songs;
import hibernateFirst.project01.utility.HibernateUtiliti;

public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory =HibernateUtiliti.getSessionFactory();
    	Session session =  sessionFactory.openSession();
       songs song= new songs();
      
       song.setName("ye rate 4");
       song.setArtils("Sanam Puri ");
       session.beginTransaction();//Transient state
       session.save(song);//Presistance state
       System.out.println("does song object managed by session-"+ session.contains(song));
       session.getTransaction().commit();
       System.out.println("song saved checked db..");
     // session.close();//detached state Session/EntityManager is closed
       session.detach(song);//remove the session
       System.out.println("does song object managed by session-"+ session.contains(song));
    }
}
