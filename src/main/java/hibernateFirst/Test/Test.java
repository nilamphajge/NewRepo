package hibernateFirst.Test;

import org.hibernate.SessionFactory;

import hibernateFirst.project01.utility.HibernateUtiliti;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory1 = HibernateUtiliti.getSessionFactory();
		SessionFactory sessionFactory2 = HibernateUtiliti.getSessionFactory();
		if(sessionFactory1==sessionFactory2)
		{
			System.out.println("sessionFactory1 And sessionFactory2 is same");
		}
		System.out.println(sessionFactory1+ "----"+sessionFactory2);
	}

}
