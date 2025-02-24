package hus.oop;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private static Inventory instance;
    private List<Product> productList = new ArrayList<>();

    private Inventory() {

    }

    public static Inventory getInstance() {
        if (instance == null) {
            instance = new Inventory();
        }
        return instance;
    }

    public int checkStock(Product product) {
        // number products in inventory (count)
        int count = 0;
        for (Product item : productList) {
            if (item.equals(product)) {
                count++;
            }
        }
        return count;
    }

    public void restock(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            productList.add(product);
        }
    }

    public void deductStock(Order order) {

        for (Product product : order.products) {
            if (productList.contains(product)) {
                productList.remove(product);
            }
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }


}
