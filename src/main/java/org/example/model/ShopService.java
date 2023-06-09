package org.example.model;

import java.util.List;
import java.util.Map;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();
    OrderRepo orderRepo = new OrderRepo();



    /*public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }*/

    public void getProduct(String id){
        System.out.println(productRepo.get(id));
    };

    public void listProducts(){
        System.out.println(this.productRepo.list());
    };
    public void addToOrder(String id){
        orderRepo.add(productRepo.get(id));
        System.out.println("Your Product has been added to your Order!");
    };
    public void addOrder(){
        orderRepo.listOfOrders.put(String.valueOf(orderRepo.checkout.id) , orderRepo.checkout.products);
        System.out.println("List of Orders: " + orderRepo.listOfOrders);
        orderRepo.checkout.products.clear();
        orderRepo.checkout.id++;

    };
   public List<Product> getOrder(String orderId){
       System.out.println("Order found: " + orderRepo.listOfOrders.get(orderId));
        return orderRepo.listOfOrders.get(orderId);
   }

    public void listOrders(){
        System.out.println("List of Orders: " + orderRepo.listOfOrders);
    }

}
