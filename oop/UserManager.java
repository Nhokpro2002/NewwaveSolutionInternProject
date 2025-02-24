package hus.oop;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> userList = new ArrayList<>();

    private static UserManager userManager;

    private UserManager() {}

    public static UserManager getInstance() {
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void showAllUsers() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
