package org.example;

import org.example.model.Product;
import org.example.model.ProductRepo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("1", "Schere");
        Product product2 = new Product("2", "Ball");
        Product product3 = new Product("3", "Maus");


        Map<String, String> products = new HashMap<>(Map.of(product1.id, product1.name, product2.id, product2.name, product3.id, product3.name));

        ProductRepo productRepo1 = new ProductRepo(products);

        System.out.println(productRepo1.get("2"));
        System.out.println(productRepo1.list());


    }
}