package test.spring.exercise.exercise3.model;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
