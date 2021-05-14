package util;

import db.crud.Member;
import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistry;
import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static String configFile = "hibernate.cfg.xml";

    static {
        try {
            // https://stackoverflow.com/questions/25684785/how-to-read-database-configuration-parameter-using-properties-file-in-hibernate
            Properties properties = propertyLoad();

            Configuration cfg = new Configuration().configure(configFile).addProperties(properties);
            cfg.addAnnotatedClass(Member.class);
            StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
            sb.applySettings(cfg.getProperties());
            StandardServiceRegistry standardServiceRegistry = sb.build();
            sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
        } catch (Throwable th) {
            System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void shutdown() {
        sessionFactory.close();
    }

    public static Properties propertyLoad() {
        Properties properties = null;

        if (properties == null) {
            properties = new Properties();
            try {
                properties.load(HibernateUtil.class
                        .getResourceAsStream("/hibernate.properties"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}