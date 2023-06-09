package org.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo{
    private final Map<String, Order> listOfOrders = new HashMap<>();

    public OrderRepo() {
        Order newOrder = new Order("1", List.of(new Product("12", "Banane")));
        listOfOrders.put(newOrder.getId(), newOrder);
    }

    public Order get(String id){
        return listOfOrders.get(id);
    };

    public void add(Order order){
        listOfOrders.put(order.getId(), order);
        System.out.println("List of Products in Order: " + listOfOrders);
    };

    public List<Order> getAllOrders() {
        System.out.println(listOfOrders);
        return new ArrayList<>(listOfOrders.values());
    }


}
