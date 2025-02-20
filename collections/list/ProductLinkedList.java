package newwavesolution.collections.list;

import java.util.LinkedList;
import java.util.List;

public class ProductLinkedList {

    List<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product getFirstProduct() {
        if (!products.isEmpty()) {
            return products.get(0);
        }
        return null;
    }

    public Product getLastProduct() {
        if (!products.isEmpty()) {
            return products.get(products.size() - 1);
        }
        return null;
    }
}
