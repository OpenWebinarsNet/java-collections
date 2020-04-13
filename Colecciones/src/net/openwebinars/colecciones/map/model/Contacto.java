package net.openwebinars.colecciones.map.model;

import java.util.Objects;

/**
 * Modelo para uno de los ejemplos con Map<K,V>
 *
 * @author Luis Miguel López Magaña
 */
public class Contacto {

    private String apellidos;
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String apellidos, String nombre, String telefono, String email) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidosNombre() {
        return this.apellidos + ", " + this.nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(apellidos, contacto.apellidos) &&
                Objects.equals(nombre, contacto.nombre) &&
                Objects.equals(telefono, contacto.telefono) &&
                Objects.equals(email, contacto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos, nombre, telefono, email);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
