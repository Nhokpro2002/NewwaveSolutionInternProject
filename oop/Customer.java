package hus.oop;

public class Customer extends User {

    private Order order;
    //private Review review;
    private PayPal payPal = new PayPal();
    private CreditCard creditCard = new CreditCard();

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
            inventory.getProductList().remove(product);
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
