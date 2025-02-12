package newwavesolution.basic;

public class Customer extends User {

    private Order order;
    //private Review review;
    private PayPal payPal;
    private CreditCard creditCard;

    public Customer(String username, String email, String password, Order order) {
        super(username, email, password);
        this.order = order;
        //this.review = review;
        this.isAdmin = false;
    }

    public void buyProduct(Product product, Inventory inventory) {
        if (inventory.getProductList().contains(product)) {
            inventory.getProductList().remove(product);
            order.products.add(product);
        }
    }

    public void writeReviewProduct(Review review, Product product) {
        product.addReview(review);
    }

    public void payByPayPay(Product product) {
        payPal.processPayment(product.getPrice());
    }

    public void payByCreditCard(Product product) {
        creditCard.processPayment(product.getPrice());
    }

}
