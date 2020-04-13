package net.openwebinars.colecciones.iterable;

import java.util.Arrays;

/**
 *  Ejemplo de uso de la interfaz Iterable
 *  @author Luis Miguel López Magaña
 */
public class IterableApp {

    public static void main(String[] args) {

        // Obtenemos el iterable por la vía que corresponda
        Iterable<String> unIterable = obtenerIterable();

        // Lo podemos recorrer usando un bucle for-each
        for (String s: unIterable) {
            System.out.println(s);
        }

        // También con el método forEach
        unIterable.forEach(System.out::println);


    }

    private static Iterable<String> obtenerIterable() {
        return Arrays.asList("String1", "String2", "String3");
    }

}
