package com.facultad.DAO;

import com.facultad.Profesor;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProfesorDAO {
    
    public void crearProfesor(Session session, Profesor profesor) {
        Transaction tx = session.beginTransaction();
        session.save(profesor);
        tx.commit();
    }
    
    public void actualizarProfesor(Session session, Profesor profesor) {
        Transaction tx = session.beginTransaction();
        session.update(profesor);
        tx.commit();
    }
    
    public void borrarProfesor(Session session, Long id) {
        Transaction tx = session.beginTransaction();
        Profesor profesor = (Profesor) session.get(Profesor.class, id);
        if (profesor != null) {
            session.delete(profesor);
        }
        tx.commit();
    }
    
    public List<Profesor> listarProfesores(Session session) {
        String hql = "FROM Profesor";
        return session.createQuery(hql).list();
    }
}
