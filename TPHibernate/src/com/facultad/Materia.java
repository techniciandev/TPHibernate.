package com.facultad;

import java.util.List;

public class Materia {

    // Atributos
    private Long id;
    private String nombre;
    private int nivel;
    private Profesor profesor;
    private List<Alumno> alumnos;

    // Constructores
    public Materia() {
    }

    ;
    
    public Materia(String nombre, int nivel, Profesor profesor, List<Alumno> alumnos) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Materia{"
                + "nombre='" + nombre + '\''
                + ", nivel=" + nivel
                + ", profesor=" + profesor
                + ", alumnos=" + alumnos
                + '}';
    }

}
