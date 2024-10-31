package com.facultad;

import java.util.Set;

public class Carrera {

    // Atributos
    private Long id;
    private String nombre;
    private Facultad facultad;
    private Set<Materia> materias;

    // Constructores
    public Carrera() {
    }

    ;
    
    public Carrera(String nombre, Facultad facultad, Set<Materia> materias) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.materias = materias;
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

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Carrera{"
                + "nombre='" + nombre + '\''
                + ", facultad=" + facultad
                + ", materias=" + materias
                + '}';
    }
}
