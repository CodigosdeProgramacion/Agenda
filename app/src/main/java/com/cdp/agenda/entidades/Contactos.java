package com.cdp.agenda.entidades;

public class Contactos {

    private int id;
    private String nombre;
    private String telefono;
    private String correoElectornico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectornico() {
        return correoElectornico;
    }

    public void setCorreoElectornico(String correoElectornico) {
        this.correoElectornico = correoElectornico;
    }
}
