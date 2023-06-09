package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

  private String id;
  private List<Product> products;

  public String getId() {
    return id;
  }

  public List<Product> getProducts() {
    return products;
  }

  public Order(String id, List<Product> products) {
    this.id = id;
    this.products = products;
  }

  @Override
  public String toString() {
    return "Order{" +
            "id='" + id + '\'' +
            ", products=" + products +
            '}';
  }
}
