package net.openwebinars.colecciones.list.c.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Ejemplo de uso de los métodos de LinkedList<E>
 *
 * @author Luis Miguel López Magaña
 */
public class LinkedListApp {

    public static void main(String[] args) {

        // LinkedList es menos adecuado que ArrayList en la mayoría de los casos

        // Suele ser adecuado si necesitamos insertar elementos en medio de la
        // colección durante la iteración

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Uno", "Dos", "Tres"));

        for(ListIterator<String> listIterator = linkedList.listIterator(); listIterator.hasNext();) {
            listIterator.next();
            listIterator.add("Otro");
        }

        linkedList.forEach(e -> System.out.println(e + " "));

    }
}
