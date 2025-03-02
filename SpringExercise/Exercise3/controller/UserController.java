package SpringExercise.Exercise3.controller;


import SpringExercise.Exercise3.model.User;
import SpringExercise.Exercise3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * add user to user list
     * @param user the user be added to user list
     */
    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/user/{userName}")
    public User getUser(@PathVariable String userName) {
        return userService.getUser(userName);
    }

    @DeleteMapping("/user/{userName}")
    public void removeUser(@PathVariable String userName) {
        userService.removeUser(userName);
    }

    @PostMapping("/edit/user/{userName}")
    public void editUserName(@RequestBody User user, @PathVariable String userName) {
        userService.editUserName(user, userName);
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
