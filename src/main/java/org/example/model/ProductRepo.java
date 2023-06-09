package org.example.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo{
    Product product1 = new Product("1", "Schere");
    Product product2 = new Product("2", "Ball");
    Product product3 = new Product("3", "Maus");
    Map<String, String> products = new HashMap<>(Map.of(product1.id, product1.name, product2.id, product2.name, product3.id, product3.name));

    /*public ProductRepo(Map<String, String> products){
        this.products = products;
    }*/

    public Map<String, String> list(){
        return this.products;
    };

    public String get(String id){
        return products.get(id);
    };
}
