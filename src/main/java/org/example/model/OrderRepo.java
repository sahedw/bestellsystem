package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo{

    Order checkout = new Order();

    Map<String, List<Product>> listOfOrders = new HashMap<>();

    /*
    public Map<String, Product> list(){};
*/
    public List<Product> get(String id){
        return listOfOrders.get(id);
    };

    public void add(Product orderedProduct){
        checkout.products.add(orderedProduct);
        System.out.println("List of Products in Order: " + checkout.products);
    };


}
