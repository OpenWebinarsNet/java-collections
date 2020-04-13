package net.openwebinars.colecciones.set.c.treeset;

import com.sun.source.tree.Tree;
import net.openwebinars.colecciones.set.modelo.Persona;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *  Ejemplo de uso de la implementación TreeSet<E>
 * @author Luis Miguel López Magaña
 */
public class TreeSetApp {

    public static void main(String[] args) {

        // Constructor sin parámetros de TreeSet
        // Genera una instancia con un árbol vacío
        // Los elementos a guardar deben implementar Comparable<E>
        Set<Persona> treeSet = new TreeSet<>();

        // Insertamos diferentes elementos
        treeSet.add(new Persona("José", "García García", LocalDate.of(1990,1,1)));
        treeSet.add(new Persona("Ana", "López Martínez", LocalDate.of(2000, 8, 24)));
        treeSet.add(new Persona("María", "Laínez Muñoz", LocalDate.of(1980, 3,3)));

        // Instanciamos un elemento para comprobar si está contenido o no
        Persona p = new Persona("José", "García García", LocalDate.of(1990,1,1));

        // Comprobamos si está contenido
        if (treeSet.contains(p))
            System.out.println("El elemento está contenido");
        else
            System.out.println("El elemento NO está contenido");

        // Aunque son dos instancias diferentes, el elemento está contenido, puesto que
        // se cumple que o1.equals(o2)

        // Si iteramos sobre los objetos del TreeSet, los obtenemos
        // en orden alfabético
        System.out.println("\nPersonas por orden alfabético");
        for (Persona persona : treeSet) {
            System.out.println(persona);
        }

        // OTRAS POSIBILIDADES DE RECORRIDO
        // Tenemos la posibilidad de recorrer el TreeSet ascendentemente (como antes)
        // o descendentemente, mediante descendingIterator

        // Algunos de estos métodos no son propios de Set<E>, sino de alguno de sus
        // subinterfaces SortedSet<E> y NavigableSet<E>.
        // Para usarlos, obtenemos una nueva referencia al objeto existente,
        // siendo dicha referencia de tipo TreeSet<E>.
        TreeSet<Persona> treeSetRef = (TreeSet<Persona>) treeSet;
        Iterator<Persona> descendente = treeSetRef.descendingIterator();

        System.out.println("\n\nPersonas por orden alfabético inverso");

        while(descendente.hasNext()) {
            System.out.println(descendente.next());
        }


        // También tenemos algunos métodos para obtener elementos de los "extremos",
        // para extraerlos, o para obtener partes del TreeSet

        System.out.println("\n\nPrimer elemento: " + treeSetRef.first());
        System.out.println("Último elemento: " + treeSetRef.last());
        System.out.println("Elemento inmediatamente menor a otro: " + treeSetRef.lower(treeSetRef.last()));

        // OTRO EJEMPLO
        // Construir un segundo TreeSet, a partir del primero,
        // pero modificando el orden por defecto.
        // Vamos a ordenar por edad (fecha de nacimiento de más antigua a más moderna)
        // Usamos el constructor TreeSet(Comparator<? super E> comparator)
        // Utilizamos una expresión lambda para construir la instancia de Comparator
        TreeSet<Persona> treeSetPorEdad =
                new TreeSet<>((o1, o2) -> o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento()));

        // Podemos añadir todos los elementos de otro Collection
        treeSetPorEdad.addAll(treeSet);

        // Si ahora iteramos, los obtenemos por edad
        System.out.println("\n\nPersonas ordenadas por edad");
        treeSetPorEdad.forEach(System.out::println);

        // Ejemplo de eliminación de un elemento
        treeSetPorEdad.remove(p);

        // Recorremos de nuevo, para comprobar
        System.out.println("\n\nEstado del TreeSet tras eliminar un elemento.");
        treeSetPorEdad.forEach(System.out::println); // El orden se mantiene

    }


}
