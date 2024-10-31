package com.facultad;

import java.util.Date;

public class Alumno extends Persona {

    // Atributos
    private Long id;
    private Long nroLegajo;
    private int anioIngreso;

    // Constructores
    public Alumno() {
    }

    ;
    
    public Alumno(String apellido, String nombre, String dni, Date fechaNacimiento, Ciudad ciudad, Long nroLegajo, int anioIngreso) {
        super(apellido, nombre, dni, fechaNacimiento, ciudad);
        this.nroLegajo = nroLegajo;
        this.anioIngreso = anioIngreso;
    }

    // Getters, setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(Long nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Alumno{"
                + "numeroLegajo=" + nroLegajo
                + ", anioIngreso=" + anioIngreso
                + ", " + super.toString()
                + '}';
    }

}
