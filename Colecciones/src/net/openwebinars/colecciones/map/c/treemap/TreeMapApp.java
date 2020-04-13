package net.openwebinars.colecciones.map.c.treemap;

import com.sun.source.tree.Tree;
import net.openwebinars.colecciones.map.model.Contacto;

import java.util.TreeMap;

/**
 * Ejemplo de uso de la clase TreeMap<K,V>
 *
 * @author Luis Miguel López Magaña
 */
public class TreeMapApp {

    public static void main(String[] args) {

        // Instanciamos nuestro TreeMap
        TreeMap<String, Contacto> contactos = new TreeMap<>();

        // Añadimos algunos contactos
        Contacto[] arrayContactos = new Contacto[] {
          new Contacto("García García", "José", "600123123", "jose.garcia@openwebinars.net"),
          new Contacto("López Martínez", "Ana", "600456456", "ana.lopez@openwebinars.net"),
          new Contacto("Castro Méndez", "Javier", "600789789", "javier.castro@openwebinars.net"),
          new Contacto("Laínez Muñoz", "María", "698765432", "maria.lainez@openwebinars.net")
        };

        for (Contacto contacto : arrayContactos) {
            contactos.put(contacto.getApellidosNombre(), contacto);
        }

        // Si los obtenemos, nos aparecen en el orden de las claves, es decir, Apellido, Nombre
        contactos.forEach((k,v) -> System.out.println(v));

        // Si añadimos un nuevo contacto, se inserta en orden
        Contacto nuevoContacto = new Contacto("Fernández Hernández", "Juan", "612345678", "juan.fernandez@openwebinars.net");
        contactos.put(nuevoContacto.getApellidosNombre(), nuevoContacto);

        // Si los volvemos a obtener todos, nos vuelven a aparecer en el orden natural de la clave
        System.out.println("\n\n");
        contactos.forEach((k,v) -> System.out.println(v));






    }


}
