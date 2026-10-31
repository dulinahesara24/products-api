package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    private double price;

    public Product (Long id, String name, double price) {
        this.id =id;
        this.name = name;
        this.price = price;
    }

Long getId() {
    return id;}

    String getName() {
        return name;}

    double getPrice() {
        return price;}
    }


