package org.example;

import org.example.model.Product;
import org.example.model.ProductRepo;
import org.example.model.ShopService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ShopService ourShop = new ShopService();
        // ourShop.getProduct("3");

        // ourShop.listProducts();

        ourShop.addToOrder("1");

        ourShop.addOrder();

        ourShop.addToOrder("2");

        ourShop.addOrder();

        ourShop.getOrder("1");

        ourShop.listOrders();
    }
}