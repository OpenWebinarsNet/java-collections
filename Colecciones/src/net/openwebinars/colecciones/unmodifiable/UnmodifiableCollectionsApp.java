package net.openwebinars.colecciones.unmodifiable;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Colecciones no modificables
 *
 * @author Luis Miguel López Magaña
 */
public class UnmodifiableCollectionsApp {

    public static void main(String[] args) {

        /**
         * COLECCIONES NO MODIFICABLES VACÍAS
         */

        // Hasta Java 8, haciendo uso de las constantes de Collections (plural)

        // Menos preferible, porque no usa genéricos
        // Disponible desde Java 1.2
        List<String> listaVacia = Collections.EMPTY_LIST;
        Map<String, String> mapVacio = Collections.EMPTY_MAP;
        Set<String> setVacio = Collections.EMPTY_SET;

        try {
            listaVacia.add("String");
        } catch (UnsupportedOperationException ex) {
            System.err.println("Has tratado de modificar una colección no modificable");
        }


        // También a través de los métodos
        // Más preferible, infiere del tipo de la referencia.
        // Disponible desde Java 1.5
        List<String> otraListaVacia = Collections.emptyList();
        Map<String, String> otroMapVacio = Collections.emptyMap();
        Set<String> otroSetVacio = Collections.emptySet();


        // O a través de los métodos .of() de los diferentes interfaces
        // Disponible desde Java 9
        List<String> listaVaciaJava9 = List.of();
        Map<String,String> mapVacioJava9 = Map.of();
        Set<String> setVacioJava9 = Set.of();


        /**
         * COLECCIONES NO MODIFICABLES CON ELEMENTOS
         */

        // Hasta Java 8

        // Versión (view) no modificable de una colección (posiblemente modificable)
        List<String> unaLista = new ArrayList<>();
        unaLista.add("mensaje");

        List<String> unaListaNoModificable = Collections.unmodifiableList(unaLista);

        try {
            unaListaNoModificable.add("String");
        } catch (UnsupportedOperationException ex) {
            System.err.println("Has tratado de modificar una colección no modificable");
        }

        // También métodos para Set y Map

        // Collections.unmodifiableMap(...)
        // Collections.unmodifiableSet(...)

        // Incluso un método genérico para Collection (singular)

        // Collections.unmodifiableCollection(...)

        // Desde Java 9

        // Diferentes versiones de los métodos .of(...)
        Set<String> unSetNoModificable = Set.of("uno", "dos", "tres", "cuatro", "cinco");

        // Se puede recorrer igual que cualquier otro Set.
        for (String s : unSetNoModificable) {
            System.out.print(s + " ");
        }
        System.out.println("\n");



    }

}
