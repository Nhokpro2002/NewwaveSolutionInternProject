package newwavesolution.collections.list;

import java.util.*;

public class ProductManager {

    List<Product> products = new ArrayList<>();

    public void addProductToArrayList(Product product) {
        products.add(product);
    }

    public void deleteProductFromArrayList(Product product) {
        products.remove(product);
    }

    public void showProductsInArrayList() {
        for (Product product: products) {
            System.out.println(product);
        }
    }

    public Product searchHighestPriceProduct() {
        if (!products.isEmpty()) {
            Product highestPriceProduct = products.get(0);
            for (int i = 1; i < products.size(); i++) {
                if (products.get(i).getPrice() > highestPriceProduct.getPrice()) {
                    highestPriceProduct = products.get(i);
                }
            }
            return highestPriceProduct;
        }
        return null;
    }

    public List<Product> getProductByCategory(String category) {
        List<Product> productListSameCategory = new ArrayList<>();
        for (Product product: products) {
            if (product.getCategory().equals(category)) {
                productListSameCategory.add(product);
            }
        }
        return productListSameCategory;
    }

    public void sortProductListByPrice() {

        Collections.sort(products);
    }

    public void sortProductListByPrice(List<Product> list) {
         list.sort(Comparator.comparing(Product::getPrice));
    }

}
