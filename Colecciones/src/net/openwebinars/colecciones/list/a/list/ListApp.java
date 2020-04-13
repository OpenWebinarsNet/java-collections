package net.openwebinars.colecciones.list.a.list;

import java.util.Arrays;
import java.util.List;

/**
 * Ejemplo de uso de los métodos de List<E>
 *
 * @author Luis Miguel López Magaña
 */
public class ListApp {

    public static void main(String[] args) {

        // Una de las formas más sencillas de obtener una lista
        List<String> lista = Arrays.asList("Uno", "Dos", "Tres", "cinco", "Seis");

        // Uso posicional de la lista
        // Los índices comienzan en 0

        // Obtener el elemento en la posición 2 (tercer elemento)
        String tercerElemento = lista.get(2);

        // Iterar sobre los elementos
        lista.forEach((x) -> System.out.print(x + " "));



    }



}
