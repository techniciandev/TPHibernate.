package com.facultad;

import java.util.Date;

public class Profesor extends Persona {

    // Atributos
    private Long id;
    private int antiguedad;

    // Constructores
    public Profesor() {
    }

    ;
    
    public Profesor(String apellido, String nombre, String dni, Date fechaNacimiento, Ciudad ciudad, int antiguedad) {
        super(apellido, nombre, dni, fechaNacimiento, ciudad);
        this.antiguedad = antiguedad;
    }

    // Getters, setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{"
                + "antiguedad=" + antiguedad
                + ", " + super.toString()
                + '}';
    }

}
