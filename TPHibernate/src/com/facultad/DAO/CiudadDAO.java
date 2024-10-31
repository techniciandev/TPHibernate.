package com.facultad.DAO;

import com.facultad.Ciudad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CiudadDAO {

    public void crearCiudad(Session session, Ciudad ciudad) {
        Transaction tx = session.beginTransaction();
        session.save(ciudad);
        tx.commit();
    }

    public void actualizarCiudad(Session session, Ciudad ciudad) {
        Transaction tx = session.beginTransaction();
        session.update(ciudad);
        tx.commit();
    }

    public void borrarCiudad(Session session, Long id) {
        Transaction tx = session.beginTransaction();
        Ciudad ciudad = (Ciudad) session.get(Ciudad.class, id);
        if (ciudad != null) {
            session.delete(ciudad);
        }
        tx.commit();
    }

    public List<Ciudad> listarCiudades(Session session) {
        String hql = "FROM Ciudad";
        return session.createQuery(hql).list();
    }
}

