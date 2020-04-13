package net.openwebinars.colecciones.map.model;

import java.util.Objects;

/**
 * Modelo para los ejemplos con Map<K,V>
 *
 * @author Luis Miguel López Magaña
 */
public class Producto implements Comparable<Producto> {

    private String referencia;
    private String nombre;
    private float precio;

    public Producto(String referencia, String nombre, float precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Float.compare(producto.precio, precio) == 0 &&
                Objects.equals(referencia, producto.referencia) &&
                Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referencia, nombre, precio);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "referencia='" + referencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    // Ordenamos los productos por precio
    @Override
    public int compareTo(Producto o) {
        return Float.compare(precio, o.getPrecio());
    }
}
