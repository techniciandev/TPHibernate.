package com.facultad;

public class Facultad {

    // Atributos
    private Long id;
    private String nombre;
    private Ciudad ciudad;

    // Constructores
    public Facultad() {
    }

    ;
    
    public Facultad(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Facultad{"
                + "nombre='" + nombre + '\''
                + ", ciudad=" + ciudad
                + '}';
    }

}
