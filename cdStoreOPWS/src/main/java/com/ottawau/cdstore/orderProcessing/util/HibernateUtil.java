/**
 * @author Aishvarya Arul Nambi
 *
 * This class is the will create the session object for the Hibernate.
 */

package com.ottawau.cdstore.orderProcessing.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
        	return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session getSession() {
        Session hibernateSession = sessionFactory.openSession();
        return hibernateSession;
    }
    
    public static Session beginTransaction() {
    	Session hibernateSession = HibernateUtil.getSession();
    	hibernateSession.beginTransaction();
    	return hibernateSession;
    	}
    	 
    public static void commitTransaction() {
    	HibernateUtil.getSession().getTransaction().commit();
    	}
    	 
    public static void rollbackTransaction() {
    	HibernateUtil.getSession().getTransaction().rollback();
    	}
    	 
    public static void closeSession() {
    	HibernateUtil.getSession().close();
    	}
    	
}
