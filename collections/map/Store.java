package newwavesolution.collections.map;

import java.util.*;

public class Store {

    private Map<String, Integer> productStock = new HashMap<>();
    private Map<String, Integer> purchaseHistory = new HashMap<>();
    private Map<Product, Integer> shoppingCart = new HashMap<>();
    private Map<User, List<Review>> userReviews = new HashMap<>();
    private TreeMap<Double, List<Product>> productsByPrice = new TreeMap<>();


    public void addProductStock(String productID, int quantity) {
        productStock.put(productID, productStock.getOrDefault(productID, 0) + quantity);
    }


    public void purchaseProduct(String userID) {
        purchaseHistory.put(userID, purchaseHistory.getOrDefault(userID, 0) + 1);
    }

    public void addToCart(Product product, int quantity) {
        shoppingCart.put(product, shoppingCart.getOrDefault(product, 0) + quantity);
    }

    public void addReview(User user, Review review) {
        userReviews.putIfAbsent(user, new ArrayList<>());
        userReviews.get(user).add(review);
    }

    public void addProductByPrice(Product product) {
        productsByPrice.putIfAbsent(product.getPrice(), new ArrayList<>());
        productsByPrice.get(product.getPrice()).add(product);
    }

    public void displayProductsByPriceRange(double minPrice, double maxPrice) {
        System.out.println("products between price from: " + minPrice + " - $" + maxPrice + ":");
        for (Map.Entry<Double, List<Product>> entry : productsByPrice.subMap(minPrice, true, maxPrice, true).entrySet()) {
            for (Product product : entry.getValue()) {
                System.out.println(product);
            }
        }
    }

    public void displayData() {
        System.out.println("quantity products in inventory:");
        for (Map.Entry<String, Integer> entry : productStock.entrySet()) {
            System.out.println("product code: " + entry.getKey() + " - quantity: " + entry.getValue());
        }

        System.out.println("\n2️⃣ Số lần mua hàng của từng khách hàng:");
        for (Map.Entry<String, Integer> entry : purchaseHistory.entrySet()) {
            System.out.println("User ID: " + entry.getKey() + " - Lượt mua: " + entry.getValue());
        }

        System.out.println("Shopping cart:");
        for (Map.Entry<Product, Integer> entry : shoppingCart.entrySet()) {
            System.out.println(entry.getKey() + " - quantity: " + entry.getValue());
        }

        System.out.println("products by review:");
        for (Map.Entry<User, List<Review>> entry : userReviews.entrySet()) {
            System.out.println(entry.getKey() + " reviewed:");
            for (Review review : entry.getValue()) {
                System.out.println("   " + review);
            }
        }

        System.out.println("products by price:");
        for (Map.Entry<Double, List<Product>> entry : productsByPrice.entrySet()) {
            System.out.println("Giá: $" + entry.getKey());
            for (Product product : entry.getValue()) {
                System.out.println("   " + product);
            }
        }
    }

}
