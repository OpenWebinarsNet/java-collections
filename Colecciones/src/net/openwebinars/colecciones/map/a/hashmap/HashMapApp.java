package net.openwebinars.colecciones.map.a.hashmap;

import net.openwebinars.colecciones.map.model.Producto;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de uso de la implementación HashMap<K,V>
 *
 * @author Luis Miguel López Magaña
 */
public class HashMapApp {

    public static void main(String[] args) {


        // HashMap tiene unos constructores muy parecidos a HashSet
        Map<String, Producto> hashMap = new HashMap<>();

        // Insertamos varios productos
        Producto pc = new Producto("PC000123", "Ordenador portátil", 800.0f);
        hashMap.put("PC000123", pc);
        hashMap.put("PC000234", new Producto("PC000234", "Ordenador compacto", 400.0f));
        hashMap.put("COMPGAM012", new Producto("COMPGAM012", "Auriculares gamer", 75.56f));
        hashMap.put("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 325.67f));


        // Si insertamos una referencia que ya existe, simplemente reemplaza el valor
        // hashMap.put("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 450.0f));

        // Se puede insertar un valor sí o solo sí la clave no está insertada,
        // y si lo está, nos devuelve el valor antiguo. En otro caso devuelve nulo
        Producto monitor = hashMap.putIfAbsent("MON274K034", new Producto("MON274K034", "Monitor 27 4K", 450.0f));

        // Se puede comprobar si se contiene alguna clave, o algún valor.
        if (hashMap.containsKey("PC000123"))
            System.out.println("El Map contiene la clave");

        if (hashMap.containsValue(pc))
            System.out.println("El Map contiene el valor");

        // También podemos hacer uso de getOrDefault
        // si queremos obtener el valor asociado
        // a una referencia y, si no existe, un valor por defecto
        System.out.println(hashMap.getOrDefault("MON274K034", monitor));

        // La forma tradicional de recorrerla es mediante un bucle for-each sobre las claves
        for (String key : hashMap.keySet())
            System.out.println(hashMap.get(key));

        System.out.println("\n\n");
        // También podemos recorrer el HashMap con un estilo "más lambda"
        hashMap.forEach((k,v) -> System.out.println(v));




    }

}
