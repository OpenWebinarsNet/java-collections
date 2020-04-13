package net.openwebinars.colecciones.queue.b.deque;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Ejemplo de uso de un Deque<E> para tratarlo como una pila
 *
 * @author Luis Miguel López Magaña
 */
public class StackApp {

    public static void main(String[] args) {

        // Según la documentación de Java, no es recomendable el uso de la clase
        // Stack<E>. En su lugar, recomiendan tratar como una pila a
        // Deque<String> pila = new ArrayDeque<>();

        // Vamos a realizar un simple comprobador de sintaxis
        // para saber si nos hemos equivocado en el número de
        // paréntesis en una expresión.
        // Por cada apertura de paréntesis, lo insertamos
        // en la pila, y por cada cierre, lo sacamos de la pila

        String expresion1 = "(a+(b+c))";

        String expresion2 = "(((a+b";

        if (comprobarParentesis(expresion1))
            System.out.println(String.format("La expresión %s es correcta", expresion1));
        else
            System.out.println(String.format("La expresión s% no es correcta", expresion1));


        if (comprobarParentesis(expresion2))
            System.out.println(String.format("La expresión %s es correcta", expresion2));
        else
            System.out.println(String.format("La expresión %s no es correcta", expresion2));

    }

    /**
     * Comprueba si una expresión tiene el número correcto de paréntesis
     * @param expresion a comprobar
     * @return True, si el número de paréntesis es adecuado, false en otro caso
     */
    private static boolean comprobarParentesis(String expresion) {

        // Declaramos la pila
        Deque<Character> pila = new ArrayDeque<>();

        // Transformamos la expresión en un array de caracteres
        char[] expresionAsArray = expresion.toCharArray();

        // Suponemos que el resultado va a ser bueno
        boolean result = true;

        // Recorremos la expresión
        for (int i = 0; i < expresionAsArray.length; i++) {
            char actual = expresionAsArray[i];
            // Si es la apertura de un paréntesis, insertamos en la pila
            if (actual == '(')
                pila.addFirst(actual);
            // Si es el cierre de un paréntesis, lo sacamos la cabecera de la pila
            else if (actual == ')') {
                // Si devuelve nulo, quiere decir que no nay elementos
                // y por tanto, la expresión es errónea
                if (pila.pollFirst() == null)
                    result = false;
            }
        }

        // Si al terminar, la pila no está vacía,
        // también es errónea
        if (result && !pila.isEmpty())
            result = false;

        // Devolvemos el resultado
        return result;


    }

}
