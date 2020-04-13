package net.openwebinars.colecciones.algoritmos;

import java.util.*;

/**
 * Uso de algunos algoritmos para colecciones
 *
 * @author Luis Miguel López Magaña
 */
public class AlgoritmosColeccionesApp {

    public static void main(String[] args) {

        /**
         * ALGORITMOS DE ORDENACIÓN
         */

        // Definimos una lista de números
        List<Integer> listaNumeros = new ArrayList<>(List.of(7,3,6,4,5,5,9));

        // La ordenamos (orden natural, ascendente)
        Collections.sort(listaNumeros);

        // Resultado
        System.out.println("ORDEN ASCENDENTE");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // La ordenamos descendentemente
        // reverseOrder devuelve el orden inverso al orden natural
        // implementado por Comparable.
        Collections.sort(listaNumeros, Collections.reverseOrder());

        // También podría haberse implementado así:
        // Collections.sort(listaNumeros, (n1, n2) -> -n1.compareTo(n2));

        // O así
        // Collections.reverse(listaNumeros)

        // Resultado
        System.out.println("\nORDEN DESCENDENTE");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // DESORDENACIÓN
        Collections.shuffle(listaNumeros);
        // Resultado
        System.out.println("\nELEMENTOS DESORDENADOS");
        listaNumeros.forEach(n -> System.out.print(n + " "));



        /**
         * ALGORITMOS DE BÚSQUEDA
         */

        // Para usar la búsqueda binaria, la lista debe estar ordenada
        Collections.sort(listaNumeros);

        // Buscamos un elemento que sabemos que está contenido en la colección
        int index = Collections.binarySearch(listaNumeros, 7);

        // Si lo encontramos...
        if (index >= 0)
            System.out.println("\n\nPodemos encontrar el elemento 7 en la posición " + index);
        else
            System.out.println("\n\nNo se ha podido encontrar el elemento 7");

        // Ahora buscamos un elemento que sabemos que no está contenido en la colección
        index = Collections.binarySearch(listaNumeros, 25);

        if (index >= 0)
            System.out.println("\nPodemos encontrar el elemento 25 en la posición " + index);
        // Si no lo encontramos...
        else {
            System.out.println("\nNo se ha podido encontrar el elemento 25");
            // Si quisiéramos insertar el elemento en el lugar adecuado, según el orden actual
            listaNumeros.add(-index-1, 25);
        }

        // Resultado
        System.out.println("\nELEMENTOS TRAS INSERTAR UN ELEMENTO EN SU LUGAR ADECUADO");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        // También se puede buscar con un orden determinado, usando la segunda
        // implementación de binarySearch

        // Ordenamos descendentemente
        Collections.sort(listaNumeros, Collections.reverseOrder());

        index = Collections.binarySearch(listaNumeros, 9, Collections.reverseOrder());

        System.out.println("\n\nELEMENTOS ORDENADOS INVERSAMENTE");
        listaNumeros.forEach(n -> System.out.print(n + " "));

        if (index >= 0)
            System.out.println("\nPodemos encontrar el elemento 9 en la posición " + index);
        else
            System.out.println("\n\nNo se ha podido encontrar el elemento 9");


        /**
         * ALGUNAS OPERACIONES
         */

        // MÁXIMO Y MÍNIMO

        // Funciona sobre Collection. Podemos probar con un Set.
        Set<Integer> conjuntoDeNumeros = new HashSet<>(listaNumeros);

        int minimo = Collections.min(conjuntoDeNumeros);

        System.out.println("\n\nEl valor minimo del conjunto de números es " + minimo);

        // FRECUENCIA

        int elemento = 5;
        int frecuencia = Collections.frequency(conjuntoDeNumeros, elemento);

        System.out.println("\nEl número de ocurrencias de " + elemento + " en la colección es " + frecuencia);


        // DISJOINT

        List<Integer> pares = List.of(1,3,5,7,9);
        List<Integer> impares = List.of(0,2,4,6,8);

        if (Collections.disjoint(pares, impares)) {
            System.out.println("\nAmbas colecciones no tienen ningún elemento en común");
        }

    }



}
