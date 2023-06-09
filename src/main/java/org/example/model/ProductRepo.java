package org.example.model;

import java.util.List;
import java.util.Map;

public class ProductRepo{

    Map<String, String> products;
    public ProductRepo(Map<String, String> products){
        this.products = products;
    }

    public Map<String, String> list(){
        return this.products;
    };

    public String get(String id){
      return products.get(id);
    };
}
