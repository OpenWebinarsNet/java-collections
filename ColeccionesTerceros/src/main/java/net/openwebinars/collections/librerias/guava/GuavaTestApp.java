package net.openwebinars.collections.librerias.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * Ejemplo de uso de colecciones con Guava
 *
 * @author Luis Miguel López Magaña
 */
public class GuavaTestApp {

    public static void main(String[] args) {

        // Vamos a probar un BiMap<String,String>,
        // que asegura la unicidad de clave y de valor
        BiMap<String, String> capitales = HashBiMap.create();

        capitales.put("España", "Madrid");
        capitales.put("Ecuador", "Quito");
        capitales.put("México", "Ciudad de México");
        capitales.put("USA", "Washington DC");
        capitales.put("Argentina", "Buenos Aires");


        // Capital de España
        System.out.println(capitales.get("España"));

        // ¿De qué país es capital Buenos Aires?
        System.out.println(capitales.inverse().get("Buenos Aires"));


    }
}
