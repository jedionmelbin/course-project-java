package com.xprotech.app.collections;

import com.xprotech.app.model.Product;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author jedionmelbin
 */
public class ChapterCollection01 {
    //Set, Map, List (Interfaz collection) Collection

    /*La interfaz Set define una colección que no puede contener elementos duplicados. 
    
    Dentro de la interfaz Set existen varios tipos de implementaciones realizadas dentro de la plataforma Java. 
    Vamos a analizar cada una de ellas:
    -HashSet
    -TreeSet
    -LinkedHashSet
     */
 /*Ofrece mejor rendimiento, este implementación almacena los elementos en una tabla hash
    No ofrece orden a la hora de iterar 
    
    Es la implementación más empleada debido a su rendimiento y a que, generalmente,
    no nos importa el orden que ocupen los elementos. Esta
    
    Es importante definir el tamaño inicial de la tabla ya que
    este tamaño marcará el rendimiento de esta implementación.
    .*/
    public Set<Product> getProducts() {
        final Set<Product> products = new HashSet<>();

        // Wrapper para acceder con multiples hilos
        Set set = Collections.synchronizedSet(new HashSet());
        
        /*No tiene acceso aleatorio
          No permite elementos duplicados
          Asegura no elementos duplicados
        */

        final Set hashSet = new HashSet(1_000_000);
        final Long startHashSetTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        final Long endHashSetTime = System.currentTimeMillis();
        System.out.println("Time spend by HashSet: " + (startHashSetTime - endHashSetTime));

        return products;
    }

    /*
    TreeSet: esta implementación almacena los elementos ordenándolos en función de sus valores
    Es bastante más lento que HashSet.
    
    Esta implementación garantiza, siempre, un rendimiento de log(N) en las operaciones básicas,
    debido a la estructura de árbol empleada para almacenar los elementos.
     */
    public Set<Product> getProducts1() {
        final Set<Product> products = new TreeSet<>();

        SortedSet sortedSet = Collections.synchronizedSortedSet(new TreeSet());

        final Set treeSet = new TreeSet();

        final Long startTreeSetTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        final Long endTreeSetTime = System.currentTimeMillis();
        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

        return products;
    }

    /*
        LinkedHashSet: esta implementación almacena los elementos en función del orden de inserción. 
        Es, simplemente, un poco más costosa que HashSet.
    
        Set si dos o más hilos acceden de forma concurrente al mismo. 
        Esto se puede solucionar empleando una serie de métodos que actúan de
        wrapper para dotar a estas colecciones de esta falta de sincronización:
     */
    public Set<Product> getProducts2() {
        final Set<Product> products = new LinkedHashSet<>();

        Set set = Collections.synchronizedSet(new LinkedHashSet());

        final Set linkedHashSet = new LinkedHashSet();
        final Long startLinkedHashSetTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        final Long endLinkedHashSetTime = System.currentTimeMillis();
        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
        return products;
    }

}
