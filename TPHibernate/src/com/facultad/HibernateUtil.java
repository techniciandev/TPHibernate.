package com.facultad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Error al crear SessionFactory." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    // Obtener sesión
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    // Abrir sesión
    public static Session abrirSession() {
        return sessionFactory.openSession();
    }
    
    // Al finalizar el programa
    public static void cerrarSession() {
        getSessionFactory().close();
    }
}
