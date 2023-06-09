package org.example;

import org.example.model.Product;
import org.example.model.ProductRepo;
import org.example.model.ShopService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ShopService test = new ShopService();
        test.getProduct("3");

        test.listProducts();



    }
}