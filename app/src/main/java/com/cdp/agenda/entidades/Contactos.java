package com.cdp.agenda.entidades;

public class Contactos {

    private int id;
    private String nombre;
    private String telefono;
    private String correo_electornico;

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

    public String getCorreo_electornico() {
        return correo_electornico;
    }

    public void setCorreo_electornico(String correo_electornico) {
        this.correo_electornico = correo_electornico;
    }
}
