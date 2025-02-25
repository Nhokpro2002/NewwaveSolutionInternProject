package newwavesolution.collections.map;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product laptop = new Product("P001", "Laptop Dell", 1200);
        Product mouse = new Product("P002", "Mouse", 25);
        Product keyboard = new Product("P003", "Typeboard", 80);

        store.addProductStock("P001", 10);
        store.addProductStock("P002", 30);
        store.addProductStock("P003", 20);

        store.purchaseProduct("U001");
        store.purchaseProduct("U002");
        store.purchaseProduct("U001");

        // Thêm vào giỏ hàng
        store.addToCart(laptop, 1);
        store.addToCart(mouse, 2);

        User user1 = new User("U001", "Nguyen Van A");
        User user2 = new User("U002", "Nguyen Van B");
        store.addReview(user1, new Review("good product!", 5));
        store.addReview(user2, new Review("good qualify", 4));

        store.addProductByPrice(laptop);
        store.addProductByPrice(mouse);
        store.addProductByPrice(keyboard);

        store.displayData();

        System.out.println("products with price between 20 and 200");
        store.displayProductsByPriceRange(20, 200);
    }
}
