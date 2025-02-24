package hus.oop;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    private String name;
    private double price;
    private String category;
    private int stock; // number items in inventory
    private List<Review> reviews = new ArrayList<>();

    public Product(String name, double price, String category, int stock) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void getReviews() {
        for (Review review : reviews) {
            System.out.println(review.displayReview());
        }
    }

    public abstract boolean equals(Product product);

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }

    public void displayReviews() {
        System.out.println("Customers reviewed: ");
        for (Review review : reviews) {
            System.out.println(review);
        }
    }



}
