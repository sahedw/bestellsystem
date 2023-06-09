package org.example.model;

public class Product {
    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String id;
    public String name;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
