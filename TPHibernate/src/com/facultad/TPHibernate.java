package com.facultad;

import com.facultad.DAO.*;
import org.hibernate.Session;

import java.util.Arrays; // Para Arrays.asList
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TPHibernate {

    public static void main(String[] args) {
        // Configurar hibernate y abrir sesión
        Session session = HibernateUtil.abrirSession();

        // Crear DAOs
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        ProfesorDAO profesorDAO = new ProfesorDAO();
        MateriaDAO materiaDAO = new MateriaDAO();
        CarreraDAO carreraDAO = new CarreraDAO();
        FacultadDAO facultadDAO = new FacultadDAO();
        CiudadDAO ciudadDAO = new CiudadDAO();
        ConsultasHQL consultasHQL = new ConsultasHQL();

        try {
            /*
                EJEMPLOS CREAR
             */
            // Crear ciudad
            Ciudad ciudad = new Ciudad("Uspallata");
            ciudadDAO.crearCiudad(session, ciudad);

            // Crear facultad
            Facultad facultad = new Facultad("Facultad de Ingeniería", ciudad);
            facultadDAO.crearFacultad(session, facultad);

            // Crear alumno
            Alumno alumno = new Alumno("García", "Juan", "12345678", new java.util.Date(), ciudad, 1001L, 2021);
            alumnoDAO.crearAlumno(session, alumno);

            // Crear profesor
            Profesor profesor = new Profesor("Lopez", "Carlos", "87654321", new java.util.Date(), ciudad, 10);
            profesorDAO.crearProfesor(session, profesor);

            // Crear materias
            Materia materia = new Materia("Matemática", 1, profesor, Arrays.asList(alumno));
            materiaDAO.crearMateria(session, materia);

            Materia materia2 = new Materia("Física", 1, profesor, Arrays.asList(alumno));
            materiaDAO.crearMateria(session, materia2);

            // Crear set de materias
            Set<Materia> materias = new HashSet<>();
            materias.add(materia);
            materias.add(materia2);

            // Crear carrera
            Carrera carrera = new Carrera("Ingeniería en Sistemas", facultad, materias);
            carreraDAO.crearCarrera(session, carrera);
            /*
            
             /*
                EJEMPLO ACTUALIZAR
             */
            // Actualizar alumno
            alumno.setAnioIngreso(2022); // Cambiar el año de ingreso
            alumnoDAO.actualizarAlumno(session, alumno);
            System.out.println("Alumno actualizado: " + alumno.getApellido() + ", " + alumno.getNombre() + " - Año de ingreso: " + alumno.getAnioIngreso());

            /*
                EJEMPLO BORRAR
             */
            // Borrar materia
            if (materias.size() > 0) {
                Materia materiaABorrar = materias.iterator().next(); // Tomo la primera materia del set
                materiaDAO.borrarMateria(session, materiaABorrar.getId());
                System.out.println("Materia borrada: " + materiaABorrar.getNombre());
            }

            /*
                EJEMPLOS LISTADOS
             */
            // Listar alumnos
            List<Alumno> alumnos = alumnoDAO.listarAlumnos(session);
            alumnos.forEach(a -> System.out.println("Alumno: " + a.getApellido() + ", " + a.getNombre()));

            // Listar todas las carreras
            List<Carrera> carreras = carreraDAO.listarCarreras(session);
            carreras.forEach(c -> System.out.println("Carrera: " + c.getNombre()));

            /*
                CONSULTAS HQL
             */
            // Profesores ordenados por antigüedad
            List<Profesor> profesoresOrdenados = consultasHQL.obtenerProfesoresOrdenadosPorAntiguedad(session);
            profesoresOrdenados.forEach(p -> System.out.println("Profesor ordenado por antigüedad: " + p.getApellido() + " - Antigüedad: " + p.getAntiguedad()));

            // Alumnos ordenados por apellido
            List<Alumno> alumnosOrdenados = consultasHQL.obtenerAlumnosOrdenadosPorApellido(session);
            alumnosOrdenados.forEach(a -> System.out.println("Lista de alumnos ordenada: " + a.getApellido()));

            // Materias de un nivel específico
            int nivel = 1; // Nivel a buscar
            List<Materia> materiasPorNivel = consultasHQL.obtenerMateriasPorNivel(session, nivel);
            materiasPorNivel.forEach(m -> System.out.println("Materia en nivel " + nivel + ": " + m.getNombre()));
            /*
            
             */

        } finally {
            session.close();
            HibernateUtil.cerrarSession();
        }
    }
}
