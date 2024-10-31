package com.facultad.DAO;

import com.facultad.Carrera;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CarreraDAO {

    public void crearCarrera(Session session, Carrera carrera) {
        Transaction tx = session.beginTransaction();
        session.save(carrera);
        tx.commit();
    }

    public void actualizarCarrera(Session session, Carrera carrera) {
        Transaction tx = session.beginTransaction();
        session.update(carrera);
        tx.commit();
    }

    public void borrarCarrera(Session session, Long id) {
        Transaction tx = session.beginTransaction();
        Carrera carrera = (Carrera) session.get(Carrera.class, id);
        if (carrera != null) {
            session.delete(carrera);
        }
        tx.commit();
    }

    public List<Carrera> listarCarreras(Session session) {
        String hql = "FROM Carrera";
        return session.createQuery(hql).list();
    }
}

