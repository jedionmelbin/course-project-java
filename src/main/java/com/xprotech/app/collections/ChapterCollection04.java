package com.xprotech.app.collections;

import com.xprotech.app.model.Customer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jedionmelbin
 */
public class ChapterCollection04 {

    Customer customer1 = new Customer(1, "Customer 1", "Paucar Cardenas", "AC545CA45A45A", 1900.30);
    Customer customer2 = new Customer(2, "Customer 2", "Paucar Cardenas", "AC5FSDDFFDSFVC", 1500.30);

    Customer customer3 = new Customer(3, "Customer 3", "Paucar Cardenas", "ACFDSAFASDF444", 5200.30);
    Customer customer4 = new Customer(4, "Customer 4", "Paucar Cardenas", "AFD5655SADDS45", 936.30);

    Customer customer5 = new Customer(5, "Customer 5", "Paucar Cardenas", "FC4545454545FD", 653.30);
    Customer customer6 = new Customer(5, "Customer 5", "Paucar Cardenas", "FC4545454545FD", 653.30);

    public Set<Customer> getCustomers() {
        // Repetir clientes
        // Agregar y borrar
        // ### ES MAS RAPIDO

        //Collections.sort(list);
        // # DESVENTAS
        //No admite duplicados
        //No se puede ordenar
        //No acceso aleatorio
        final Set<Customer> customers = new HashSet<>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        for (Customer customer : customers) {
            System.out.println("NAME:: " + customer.getFirstName() +
                    " BALANCE: " + customer.getBalance());
        }
        //#### Por que no soporta el repetido ? METODO HASHCODE
        //HashCode, Equals, (Stack space of memory variable primitive, referencia ala instancia)
        //Heap => Almacena el objeto
        
        //#### METODO EQUALS
        
        if(customer5.equals(customer6)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        

        return customers;

    }

    public Set<Customer> getCustomers1() {
        final Set<Customer> customers = new TreeSet<>();

        return customers;
    }

    public Set<Customer> getCustomers2() {
        final Set<Customer> customers = new LinkedHashSet<>();

        return customers;
    }

    public ArrayList<String> converToArray() {
        return new ArrayList<>();
    }
}
