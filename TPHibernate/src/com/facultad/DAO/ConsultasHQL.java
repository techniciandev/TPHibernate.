package com.facultad.DAO;

import com.facultad.Alumno;
import com.facultad.Materia;
import com.facultad.Profesor;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ConsultasHQL {
    
    // Alumnos ordenados por apellido
    public List<Alumno> obtenerAlumnosOrdenadosPorApellido(Session session) {
        String hql = "FROM Alumno a ORDER BY a.apellido ASC";
        Query query = session.createQuery(hql);        
        return query.list();    
    }
    
    // Profesores ordenados por antiguedad
    public List<Profesor> obtenerProfesoresOrdenadosPorAntiguedad(Session session) {
        String hql = "FROM Profesor p ORDER BY p.antiguedad DESC";
        Query query = session.createQuery(hql);
        return query.list();
    }
    
    // Todas las materias
    public List<Materia> obtenerMateriasPorNivel(Session session, int nivel) {
        String hql = "FROM Materia m WHERE m.nivel = :nivel";
        Query query = session.createQuery(hql);
        query.setParameter("nivel", nivel);
        return query.list();
    }
}
