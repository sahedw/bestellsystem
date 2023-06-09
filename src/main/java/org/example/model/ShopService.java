package org.example.model;

import java.util.List;

public class ShopService {

    ProductRepo productRepo = new ProductRepo();



    /*public ShopService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }*/

    public void getProduct(String id){
        System.out.println(productRepo.get(id));
    };

    public void listProducts(){
        System.out.println(this.productRepo.list());
    };

  /*  public void addOrder(Map<Product>){

    };
    public Map<String, Product> getOrder(String orderId){

    };
    public Map<String, Order> listOrders(){

    };*/

}
