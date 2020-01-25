package com.sda.twitter.persistance;

import com.sda.twitter.utils.EnvironemntVariableUtil;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final String HIBERNATE_CONNECTION_PASSWORD = "hibernate.connection.password";
    private static final String HIBERNATE_CONNECTION_USERNAME = "hibernate.connection.username";
    private static final String HIBERNATE_CONNECTION_URL = "hibernate.connection.url";
    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();


    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .setProperty(HIBERNATE_CONNECTION_URL, EnvironemntVariableUtil.getVariable(HIBERNATE_CONNECTION_URL))
                    .setProperty(HIBERNATE_CONNECTION_USERNAME, EnvironemntVariableUtil.getVariable(HIBERNATE_CONNECTION_USERNAME))
                    .setProperty(HIBERNATE_CONNECTION_PASSWORD, EnvironemntVariableUtil.getVariable(HIBERNATE_CONNECTION_PASSWORD))
                    .configure()
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
