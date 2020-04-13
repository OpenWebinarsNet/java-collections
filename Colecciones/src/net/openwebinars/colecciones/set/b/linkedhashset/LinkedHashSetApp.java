package net.openwebinars.colecciones.set.b.linkedhashset;

import net.openwebinars.colecciones.set.modelo.Persona;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetApp {

    public static void main(String[] args) {

        // Los constructores de LinkedHashSet se comportan como los de HashSet

        // Instancia un nuevo LinkedHashSet con las mismas características
        // que el constructor de HashSet
        Set<Persona> linkedHashSet = new LinkedHashSet<>();

        // Insertamos diferentes elementos
        linkedHashSet.add(new Persona("José", "García García", LocalDate.of(1990,1,1)));
        linkedHashSet.add(new Persona("Ana", "López Martínez", LocalDate.of(2000, 8, 24)));
        linkedHashSet.add(new Persona("Javier", "Castro Méndez", LocalDate.of(1970, 6,30)));
        linkedHashSet.add(new Persona("María", "Laínez Muñoz", LocalDate.of(1980, 3,3)));

        // Independientemente del orden que tenga implementada una determinada
        // clase, LinkedHashSet mantiene solo el orden de inserción
        System.out.println("Elementos de la colección");
        for (Persona p : linkedHashSet) {
            System.out.println(p);
        }

        // Podemos eliminar un determinado elemento
        Persona p = new Persona("Javier", "Castro Méndez", LocalDate.of(1970, 6,30));
        linkedHashSet.remove(p);
        // Y añadir uno nuevo
        linkedHashSet.add(new Persona("Alicia", "Antúnez Marín", LocalDate.of(2010, 10,10)));
        // Al iterar de nuevo la colección, se sigue manteniendo el orden de inserción
        System.out.println("\n\nElementos de la colección después de unas modificaciones");
        linkedHashSet.forEach(System.out::println);

        // Conversión de un Set en un array
        // Esta funcionalidad es común en el interfaz Set, y la mostramos en esta implementación
        Persona[] personas = new Persona[linkedHashSet.size()];
        linkedHashSet.toArray(personas);
        System.out.println("\n\nLinkedHashSet transformado en un array: " + Arrays.toString(personas));
    }
}
