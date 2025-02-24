package hus.oop;

public class Discount {

    public void applyDiscount(Product product, double percentage) {
        if (percentage > 0 && percentage <= 1) {
            double newPrice = product.getPrice() * (1 - percentage);
            product.setPrice(newPrice);
        }
    }

    public void applyBulkDiscount(Cart cart, double percentage, int price) {
        if (cart.getTotalPrice() > price) {
            double newPrice = cart.getTotalPrice() * (1 - percentage);
            cart.setTotalPrice(newPrice);
        }
    }
}
