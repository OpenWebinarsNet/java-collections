package net.openwebinars.collections.librerias.apache;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

import java.util.Set;

/**
 * Ejemplo de uso de colecciones con Apache Commons Collections
 *
 * @author Luis Miguel López Magaña
 */
public class ApacheCommonsCollectionsTestApp {

    public static void main(String[] args) {

        // Ejemplo de uso de Bag
        // Se trata de una colección que permite duplicados
        // y un método conveniente para contar las ocurrencias de los mismos;
        // También permite obtener un Set con los elementos únicos

        Bag<String> bag = new HashBag<>();

        // Añadimos le letra O dos veces
        bag.add("O", 2);

        // Añadimos la letra p una vez
        bag.add("p");

        // Añadimos la letra e tres veces
        bag.add("e", 3);

        // Mostramos el contenido del bag
        System.out.println(bag);

        // El número de veces que está presente la letra e
        int nOcurrencias = bag.getCount("e");
        System.out.println("El número de ocurrencias de e es " +  nOcurrencias);

        // Podemos obtener un Set con los elementos únicos
        Set<String> set = bag.uniqueSet();

        System.out.println(set);


    }

}
