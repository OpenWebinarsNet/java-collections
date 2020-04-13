package net.openwebinars.colecciones.queue.a.queue;

import net.openwebinars.colecciones.queue.a.queue.model.FifoEntry;
import net.openwebinars.colecciones.queue.a.queue.model.Pasajero;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Ejemplo de uso de una cola con prioridad, PriorityQueue
 *
 * @author Luis Miguel López Magaña
 */
public class PriorityQueueApp {

    public static void main(String[] args) {

        // Una cola con prioridad nos permite "ordenar" un poco los
        // elementos dentro de la cola.
        // El tipo de los elementos debe implementar Comparable


        // Creamos una cola para gestionar el orden de embarque de algunos pasajeros
        // a un medio de transporte. Algunos pasajeros tiene mayor prioridad que otros,
        // según lo hayan abonado al comprar su billete.
        Queue<Pasajero> cola = new PriorityQueue<>();


        // Los pasajeros van llegando a la cola
        cola.add(new Pasajero("María", 1));
        cola.add(new Pasajero("Manuel", 2));
        cola.add(new Pasajero("Antonio", 1));
        cola.add(new Pasajero("Rosa", 3));
        cola.add(new Pasajero("Ana", 5));


        // Es hora de embarcar.
        // Los pasajeros van pasando conforme se va vaciando la cola
        while(!cola.isEmpty())
            System.out.println(cola.remove());


        // ¡OJO! No se nos asegura que los elementos de igual
        // prioridad se obtengan en orden de inserción :S
        // Para ello, tendríamos que añadir un segundo elemento
        // que nos permita manejar el orden de inserción

        Queue<FifoEntry<Pasajero>> cola2 = new PriorityQueue<>();


        cola2.add(new FifoEntry<Pasajero>(new Pasajero("María", 1)));
        cola2.add(new FifoEntry<Pasajero>(new Pasajero("Manuel", 2)));
        cola2.add(new FifoEntry<Pasajero>(new Pasajero("Antonio", 1)));
        cola2.add(new FifoEntry<Pasajero>(new Pasajero("Rosa", 3)));
        cola2.add(new FifoEntry<Pasajero>(new Pasajero("Ana", 5)));

        // Gracias a FifoEntry, ahora sí que obtenemos los elementos
        // de igual prioridad en orden de inserción
        System.out.println("\n\n");
        while(!cola2.isEmpty())
            System.out.println(cola2.remove().getEntry());




    }

}
