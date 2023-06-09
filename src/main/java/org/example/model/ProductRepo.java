package org.example.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo{
    private Product product1 = new Product("1", "Schere");
    private Product product2 = new Product("2", "Ball");
    private Product product3 = new Product("3", "Maus");
    private final Map<String, Product> products = new HashMap<>();


    public ProductRepo() {
        products.put(product1.id, product1);
        products.put(product2.id, product2);
        products.put(product3.id, product3);
    }

    public Map<String, Product> list(){
        return this.products;
    };

    public Product get(String id){
        return products.get(id);
    };

    @Override
    public String toString() {
        return "ProductRepo{" +
                "product1=" + product1 +
                ", product2=" + product2 +
                ", product3=" + product3 +
                ", products=" + products +
                '}';
    }
}
