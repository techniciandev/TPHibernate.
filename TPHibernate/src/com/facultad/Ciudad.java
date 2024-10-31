package com.facultad;

public class Ciudad {

    // Atributos
    private Long id;
    private String nombre;

    //Constructores
    public Ciudad() {
    }

    ;
    
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    // Getters, setters
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

    @Override
    public String toString() {
        return "Ciudad{"
                + "nombre='" + nombre + '\''
                + '}';
    }
}
