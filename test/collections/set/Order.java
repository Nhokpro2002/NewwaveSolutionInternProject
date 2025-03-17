package test.collections.set;

import java.util.Date;
import java.util.List;

public class Order {
    private List<Product> productList;
    private Date dateOrder;

    public Order(List<Product> productList, Date dateOrder) {
        this.productList = productList;
        this.dateOrder = dateOrder;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Date getDateOrder() {
        return dateOrder;
    }
}
