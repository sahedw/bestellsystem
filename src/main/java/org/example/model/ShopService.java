package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {

    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderRepo();

    private List<Product> listOfProducts = new ArrayList<>();


    public void getProduct(String id){
        System.out.println(productRepo.get(id));
    };

    public void listProducts(){
        System.out.println(this.productRepo.list());
    };
    public void addToOrder(String id){
        listOfProducts.add(productRepo.get(id));
        System.out.println("Your Product has been added to your Order!");
    };
    public void addOrder(){
        Order order = new Order(UUID.randomUUID().toString().substring(0, 4), listOfProducts);
        orderRepo.add(order);
        System.out.println(listOfProducts);
        listOfProducts.clear();
    };
   public Order getOrder(String orderId){
       System.out.println("Order found: " + orderRepo.get(orderId));
        return orderRepo.get(orderId);
   }

    public void listOrders(){
        System.out.println("List of Orders: " + orderRepo.getAllOrders());
    }

}
