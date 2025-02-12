package newwavesolution.basic;

import java.util.List;

public class Order {

    private String orderID;
    private User user;
    protected List<Product> products;
    private double totalPrice;
    private String orderStatus;

    public Order(String orderID, User user, List<Product> products, double totalPrice) {
        this.orderID = orderID;
        this.user = user;
        this.products = products;
        this.totalPrice = totalPrice;

    }

    public void updateStateOrder() {
        // do something
    }


}
