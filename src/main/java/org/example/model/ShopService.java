package org.example.model;

public interface ShopService {

    public Product getProduct();

    public List<Product> listProducts();

    public void addOrder(Map<Product>);
    public Map<String, Product> getOrder(String orderId);
    public Map<String, Order> listOrders();

}
