package util;

import db.crud.Member;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static String configFile = "hibernate.cfg.xml";


    static{
        try {
            Configuration cfg = new Configuration().configure(configFile);
            cfg.addAnnotatedClass(Member.class);
            StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
            sb.applySettings(cfg.getProperties());
            StandardServiceRegistry standardServiceRegistry = sb.build();
            sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
        } catch (Throwable th) {
            System.err.println("initial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
        }
    } // static

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    } // getSessionFactory

    public void shutdown(){
        sessionFactory.close();
    } // shutdown

} // class
