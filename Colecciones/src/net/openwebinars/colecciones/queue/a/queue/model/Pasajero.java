package net.openwebinars.colecciones.queue.a.queue.model;

import java.util.Objects;

/**
 * Clase modelo para algunos de los ejemplos
 */
public class Pasajero implements Comparable<Pasajero> {

    private String nombre;
    private int prioridad;

    public Pasajero(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return prioridad == pasajero.prioridad &&
                Objects.equals(nombre, pasajero.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, prioridad);
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "nombre='" + nombre + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }

    // Las instancias de Pasajero se ordenan según prioridad
    // La prioridad es más grande cuanto mayor es el número
    // entero almacenado en la propiedad prioridad
    @Override
    public int compareTo(Pasajero o) {
        return -Integer.compare(prioridad, o.getPrioridad());
    }
}
