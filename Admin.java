package newwavesolution.basic;

public class Admin extends User {

    //private boolean isAdmin;
    protected Order order;
    protected Inventory inventory;

    public Admin(String userName, String email, String password, Order order, Product product) {
        super(userName, email, password);
        this.isAdmin = true;
        this.order = order;

    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
