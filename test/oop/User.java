package test.oop;

public class User implements OrderObserver {

    private String userName;
    private String email;
    private String password;
    protected boolean isAdmin;

    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkSignIn(String password) {

        if(password.equals(this.password)) {
            //System.out.println("User is logged in");
            return true;
        }
        return false;
    }

    public void checkOut() {
        System.out.println("User is logged out");
    }

    //public void

    @Override
    public void update(String orderID, String newState) {
        System.out.println(userName + " received order update: " + orderID + " new State: " + newState);
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", email=" + email + ", password=" + password + "]";
    }

}
