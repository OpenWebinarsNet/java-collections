package net.openwebinars.collections.librerias.eclipse;


import org.eclipse.collections.api.list.primitive.*;
import org.eclipse.collections.impl.factory.primitive.*;
import org.eclipse.collections.impl.list.primitive.IntInterval;

/**
 * Ejemplo de uso de colecciones con Eclipse Collections
 *
 * @author Luis Miguel López Magaña
 */
public class EclipseCollectionsTestApp {

    public static void main(String[] args) {

        // Colecciones para tipos primitivos
        //Mutable and immutable Lists, Sets, Bags, Stacks and Maps are available for all 8 primitive types
        MutableIntList intList =
                IntLists.mutable.of(1, 2, 3);
        MutableLongList longList =
                LongLists.mutable.of(1L, 2L, 3L);
        MutableCharList charList =
                CharLists.mutable.of('a', 'b', 'c');
        MutableShortList shortList =
                ShortLists.mutable.of((short)1, (short)2, (short)3);
        MutableByteList byteList =
                ByteLists.mutable.of((byte)1, (byte)2, (byte)3);
        MutableBooleanList booleanList =
                BooleanLists.mutable.of(true, false);
        MutableFloatList floatList =
                FloatLists.mutable.of(1.0f, 2.0f, 3.0f);
        MutableDoubleList doubleList =
                DoubleLists.mutable.of(1.0, 2.0, 3.0);

        // Rangos con IntInterval
        IntInterval oneTo10 =
                IntInterval.fromTo(1, 10); // enteros desde 1 a 10
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        oneTo10.forEach(System.out::println);

        IntInterval oneTo10By3 =
                IntInterval.fromToBy(1, 10, 3); // enteros del 1 al 10, incrementando de 3 en 3
        // [1, 4, 7, 10]

        IntInterval oddsFrom1To10 =
                IntInterval.oddsFromTo(1, 10); // enteros impares del 1 al 10
        // [1, 3, 5, 7, 9]

        IntInterval evensFrom1To10 =
                IntInterval.evensFromTo(1, 10); // enteros pares del 1 al 10
        // [2, 4, 6, 8, 10]



    }

}
