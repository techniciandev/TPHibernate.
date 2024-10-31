package com.facultad.DAO;

import com.facultad.Facultad;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class FacultadDAO {

    public void crearFacultad(Session session, Facultad facultad) {
        Transaction tx = session.beginTransaction();
        session.save(facultad);
        tx.commit();
    }

    public void actualizarFacultad(Session session, Facultad facultad) {
        Transaction tx = session.beginTransaction();
        session.update(facultad);
        tx.commit();
    }

    public void borrarFacultad(Session session, Long id) {
        Transaction tx = session.beginTransaction();
        Facultad facultad = (Facultad) session.get(Facultad.class, id);
        if (facultad != null) {
            session.delete(facultad);
        }
        tx.commit();
    }

    public List<Facultad> listarFacultades(Session session) {
        String hql = "FROM Facultad";
        return session.createQuery(hql).list();
    }
}

