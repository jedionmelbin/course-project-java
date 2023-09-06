/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprotech.app.collections;

import com.xprotech.app.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author jedionmelbin
 */
public class ChapterCollection02 {

    /*
            ArrayList,LinkedList
     */
 /*
    Acceso posicional a elementos: manipula elementos en función de su posición en la lista.
Búsqueda de elementos: busca un elemento concreto de la lista y devuelve su posición.
Iteración sobre elementos: mejora el Iterator por defecto.
Rango de operación: permite realizar ciertas operaciones sobre ragos de elementos dentro de la propia lista.
    
     */
    public List<Product> getProducts() {
        // Sobretodo, varían los tiempos de inserción, búsqueda y eliminación de
        final List<Product> products = new ArrayList<>();
        
        /*Muy rapida accediendo a elementos*/
        /*Se adapta a un gran numero de escenarios*/

        // Manejo por multiples hilos
        final List list = Collections.synchronizedList(new ArrayList<>());

        final List arrayList = new ArrayList();

        return products;
    }
    
    /*
        Acceso aleatorio
        Estan ordenadas collection.sort()
        Anadir / eliminar sin restriccion
        List iterator modifica en cualquier dirteccion
        Syntaxis similiar a arrays
    */

    public List<Product> getProducts1() {
        final List<Product> products = new LinkedList<>();

        // Manejo por acceso multiples hilos
        /*Lista enlazadas*/
        /*Gran eficiciencia agregando y eliminando elementos*/
        final List list = Collections.synchronizedList(new LinkedList<>());

        final List linkedList = new LinkedList();

        return products;
    }

    /*
     La interfaz Map asocia claves a valores. Esta interfaz no puede contener claves duplicadas y; 
     cada una de dichas claves, sólo puede tener asociado un valor como máximo.
     */
    public Map<String, String> getProducts2() {
        final Map<String, String> products = new HashMap<>();
        
        
        final Map map = Collections.synchronizedMap(new HashMap<>());
        
        return products;
    }

    public Map<String, String> getProducts3() {
        final Map<String, String> products = new TreeMap<>();
        
        final Map map = Collections.synchronizedSortedMap(new TreeMap<>());
        
        return products;
    }
    
     public Map<String, String> getProducts4() {
        final Map<String, String> products = new LinkedHashMap<>();
        
         final Map map = Collections.synchronizedMap(new LinkedHashMap<>());
         
        return products;
    }
     
     /*Vector=> obsoleto*/
}
