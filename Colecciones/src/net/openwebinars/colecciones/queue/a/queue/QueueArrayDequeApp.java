package net.openwebinars.colecciones.queue.a.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Ejemplo de uso de los métodos de Queue<E>
 *
 * @author Luis Miguel López Magaña
 */
public class QueueArrayDequeApp {

    public static void main(String[] args) {

        // Podemos usar una cola si necesitamos obtener los elementos en el orden
        // en el cual los hemos insertado

        Queue<String> meses = new ArrayDeque<>();

        // Insertamos los diferentes meses del año
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");

        // ¿Qué mes está ahora mismo en la cabecera de la cola?
        System.out.println(meses.element());

        System.out.println("\n\n");
        // Vaciamos la cola, obteniendo todos los meses
        while (!meses.isEmpty()) {
            System.out.println(meses.remove());
        }



    }

}
