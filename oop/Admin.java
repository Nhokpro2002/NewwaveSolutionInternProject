package hus.oop;

public class Admin extends User {

    //private boolean isAdmin;
    protected Order order;
    protected Inventory inventory;

    public Admin(String userName, String email, String password, Order order) {
        super(userName, email, password);
        this.isAdmin = true;
        this.order = order;

    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
