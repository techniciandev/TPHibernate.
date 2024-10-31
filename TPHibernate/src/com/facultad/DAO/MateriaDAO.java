package com.facultad.DAO;

import com.facultad.Materia;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MateriaDAO {

    public void crearMateria(Session session, Materia materia) {
        Transaction tx = session.beginTransaction();
        session.save(materia);
        tx.commit();
    }

    public void actualizarMateria(Session session, Materia materia) {
        Transaction tx = session.beginTransaction();
        session.update(materia);
        tx.commit();
    }

    public void borrarMateria(Session session, Long id) {
        Transaction tx = session.beginTransaction();
        Materia materia = (Materia) session.get(Materia.class, id);
        if (materia != null) {
            session.delete(materia);
        }
        tx.commit();
    }

    public List<Materia> listarMaterias(Session session) {
        String hql = "FROM Materia";
        return session.createQuery(hql).list();
    }
}

