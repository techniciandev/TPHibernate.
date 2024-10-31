package com.facultad;

import java.util.Date;

public abstract class Persona {

    // Atributos
    private String apellido;
    private String nombre;
    private String dni;
    private Date fechaNacimiento;
    private Ciudad ciudad;

    // Constructores
    public Persona() {
    }

    ;
    
    public Persona(String apellido, String nombre, String dni, Date fechaNacimiento, Ciudad ciudad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    // Getters, setters
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "apellido='" + apellido + '\''
                + ", nombre='" + nombre + '\''
                + ", dni='" + dni + '\''
                + ", fechaNacimiento=" + fechaNacimiento
                + ", ciudad=" + ciudad
                + '}';
    }

}
