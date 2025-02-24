package hus.oop;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> listProduct = new ArrayList<>();
    private static Cart instance;

   protected int initQuantity = 0;

   private double totalPrice = 0;

    private Cart() {
        //initQuantity = 0;
    }

    public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public void addProduct(Product product, int quantity) {
        listProduct.add(product);
        initQuantity += quantity;

    }

    public void removeProduct(Product product) {
        if (listProduct.contains(product)) {
            listProduct.remove(product);
            initQuantity--;
        }
    }

    public double getTotalPrice() {
        double sumPrice = 0;
        for (Product product : listProduct) {
            sumPrice += product.getPrice();
        }
        totalPrice = sumPrice;
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
