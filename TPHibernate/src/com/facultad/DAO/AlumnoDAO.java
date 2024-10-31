package com.facultad.DAO;

import com.facultad.Alumno;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlumnoDAO {
    
    public void crearAlumno(Session session, Alumno alumno) {
        Transaction tx = session.beginTransaction();
        session.save(alumno);
        tx.commit();
    }
    
    public void actualizarAlumno(Session session, Alumno alumno) {
        Transaction tx = session.beginTransaction();
        session.update(alumno);
        tx.commit();
    }
    
    public void borrarAlumno(Session session, Long id) {
        Transaction tx = session.beginTransaction();
        Alumno alumno = (Alumno) session.get(Alumno.class, id);
        if (alumno != null) {
            session.delete(alumno);
        }
        tx.commit();
    }
    
    public List<Alumno> listarAlumnos(Session session) {
        String hql = "FROM Alumno";
        return session.createQuery(hql).list();
    }
}
