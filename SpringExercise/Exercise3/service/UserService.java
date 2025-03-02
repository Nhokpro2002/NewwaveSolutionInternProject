package SpringExercise.Exercise3.service;

import SpringExercise.Exercise3.model.User;
import SpringExercise.Exercise3.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    Users users;

    /**
     * Add a new user to the user list
     * @param user the user to be added
     */
    public void addUser(User user) {
        users.getUsers().add(user);
    }

    /**
     * Remove User from the user list
     * @param userName the user be removed from user list
     */
    public void removeUser(String userName) {
        users.getUsers().removeIf(user -> userName.equals(user.getName()));
    }

    /**
     * edit name of user in user list
     * @param user the user be changed name
     * @param name new name of user
     */

    public void editUserName(User user, String name) {
        user.setName(name);
    }

    /**
     * @param userName name of user be got
     * @return User
     */

    public User getUser(String userName) {
        for (User user: users.getUsers()) {
            if(userName.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }


    /**
     *
     * @return the user list
     */
    public List<User> getUsers() {
        return users.getUsers();
    }
}
