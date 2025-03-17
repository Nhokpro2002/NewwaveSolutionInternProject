package test.oop;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String orderID;
    private User customer;
    private User admin;
    protected List<Product> products = new ArrayList<>();
    private double totalPrice;
    private String orderStatus;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String orderID, User customer, User admin, List<Product> products, double totalPrice) {
        this.orderID = orderID;
        this.customer = customer;
        this.admin = admin;
        this.products = products;
        this.totalPrice = totalPrice;

    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void updateStateOrder(String newState) {
        this.orderStatus = newState;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderID, orderStatus);
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
