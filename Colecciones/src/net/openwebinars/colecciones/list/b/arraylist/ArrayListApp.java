package net.openwebinars.colecciones.list.b.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Ejemplo de uso de los métodos de ArrayList<E> (con una referencia de tipo List<E>
 *
 * @author Luis Miguel López Magaña
 */
public class ArrayListApp {

    public static void main(String[] args) {

        // Podemos construir un ArrayList a partir de otra colección
        List<String> lista = new ArrayList<>(Arrays.asList("Uno", "Dos", "Tres", "cinco", "Seis"));

        // USO POSICIONAL

        // Uso posicional de la lista
        // Los índices comienzan en 0

        // Obtener el elemento en la posición 2 (tercer elemento)
        String tercerElemento = lista.get(2);

        // Añadir un elemento en una posición determinada
        lista.add(3, "Cuatro");

        // Sustituir un elemento de una determinada posición
        lista.set(4, "Cinco");

        // Eliminar un elemento de una determinada posición
        // Devuelve el elemento eliminado
        String eliminado = lista.remove(5);

        // Posibilidad de contener repetidos
        lista.add("Seis");
        lista.add("Seis");

        // Iterar sobre los elementos mediante un forEach
        lista.forEach((x) -> System.out.print(x + " "));

        // FUNCIONES DE BÚSQUEDA

        // Búsqueda de la primera o la última ocurrencia de un elemento
        int posicion1 = lista.indexOf("Dos");
        int posicion2 = lista.lastIndexOf("Seis");

        System.out.println("\n\nLa primera ocurrencia de Dos está en la posición " + posicion1);
        System.out.println("La última ocurrencia de Seis está en la posición " + posicion2);

        // ITERACIÓN EXTENDIDA

        // Se realiza a través del uso de ListIterator
        // Este nos permite iterar en cualquier dirección, así como
        // añadir, modificar y eliminar

        // Ejemplo de iteración hacia atrás
        for (ListIterator<String> listIterator = lista.listIterator(lista.size());
             listIterator.hasPrevious();) {
            System.out.print(listIterator.previous() + " ");
        }

        // OPERACIONES SOBRE UN RANGO DE ELEMENTOS

        // La lista que se obtiene no es una nueva lista
        // sino una "vista" de la ya existente.
        // Las operaciones que modifiquen la sublista,
        // modificarán la lista subyacente.

        List<String> subLista = lista.subList(3,5);
        System.out.println("\n\nElementos de la sublista");
        for (String s : subLista) {
            System.out.print(s + " ");
        }

        // Si eliminamos elementos de la sublista
        // se eliminan de la lista.
        subLista.clear();

        System.out.println("\n\nElementos de la lista modificados a través de la sublista");
        for (String s : lista) {
            System.out.print(s + " ");
        }

    }

}
