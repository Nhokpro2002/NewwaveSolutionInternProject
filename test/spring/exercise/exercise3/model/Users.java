package test.spring.exercise.exercise3.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Users {

    private List<User> users;

    public Users(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}
