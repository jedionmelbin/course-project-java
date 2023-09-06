package com.xprotech.app.collections;

import com.xprotech.app.model.Customer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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

    public Set<Customer> getCustomers() {
        //ret
        // Repetir clientes
        // Agregar y borrar

        //Collections.sort(list);
        final Set<Customer> setCustomers = new HashSet<>();

        //No admite duplicados
        //https://www.youtube.com/watch?v=rqHBXAZ9F9k&ab_channel=pildorasinformaticas
        return setCustomers;

    }

    public ArrayList<String> converToArray() {
        return new ArrayList<>();
    }
}
